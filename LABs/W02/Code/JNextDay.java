import java.util.Scanner;

public class NextDate {

    // Function to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int[] daysInMonth = {
            31,
            isLeapYear(year) ? 29 : 28,
            31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Check if the date is valid
        if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("Invalid date.");
        } else {

            day++;

            if (day > daysInMonth[month - 1]) {
                day = 1;
                month++;

                if (month > 12) {
                    month = 1;
                    year++;
                }
            }

            System.out.println("The next date is: " + day + "/" + month + "/" + year);
        }

        sc.close();
    }
}