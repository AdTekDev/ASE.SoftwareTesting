import java.util.Scanner;
import java.util.Arrays;

public class JTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = sc.nextDouble();

        // Check if the sides can form a triangle
        if (a + b > c && a + c > b && b + c > a) {

            double[] sides = {a, b, c};
            Arrays.sort(sides);

            double x = sides[0];
            double y = sides[1];
            double z = sides[2]; // largest side

            boolean isRight = Math.abs(x * x + y * y - z * z) < 1e-6;

            if (a == b && b == c) {
                System.out.println("This is an Equilateral triangle.");
            }
            else if (isRight && (a == b || b == c || a == c)) {
                System.out.println("This is a Right Isosceles triangle.");
            }
            else if (isRight) {
                System.out.println("This is a Right triangle.");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("This is an Isosceles triangle.");
            }
            else {
                System.out.println("This is a Scalene triangle.");
            }

        } else {
            System.out.println("The given sides do not form a triangle.");
        }

        sc.close();
    }
}