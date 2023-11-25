import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        int daysInMonth = (month >= 1 && month <= 12) ? getDaysInMonth(year, month) : -1;

        System.out.println((daysInMonth != -1) ? "Number of days in the given month: " + daysInMonth : "Invalid month. Please enter a month between 1 and 12.");

        scanner.close();
    }

    public static int getDaysInMonth(int year, int month) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return (month == 2 && isLeapYear(year)) ? 29 : daysInMonth[month];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
