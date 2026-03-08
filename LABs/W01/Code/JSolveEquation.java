import java.util.Scanner;

public class JSolveEquation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Solve quadratic equation: ax^2 + bx + c = 0");

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        // Check if a = 0
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("The equation has infinitely many solutions.");
                } else {
                    System.out.println("The equation has no solution.");
                }
            } else {
                double x = -c / b;
                System.out.println("The equation has one solution: x = " + x);
            }
        } 
        else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("The equation has two distinct solutions:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } 
            else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has a double root: x = " + x);
            } 
            else {
                System.out.println("The equation has no real solution.");
            }
        }

        sc.close();
    }
}