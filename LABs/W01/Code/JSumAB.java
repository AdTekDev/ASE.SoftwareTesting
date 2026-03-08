import java.util.Scanner;

public class JSumAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a: ");
        double a = sc.nextDouble();

        System.out.print("Enter number b: ");
        double b = sc.nextDouble();

        double sumAB = a + b;

        System.out.println("The sum of " + a + " and " + b + " is: " + sumAB);

        if (sumAB == a)
        {
            System.out.println("Sum == a = " + sumAB);
        } else {
            System.out.println("Sum = " + sumAB + " is not equal to a = " + a);
        }

        sc.close();
    }
}