import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first fraction
        System.out.print("Enter the first fraction (numerator/denominator): ");
        int numerator1 = scanner.nextInt();
        int denominator1 = scanner.nextInt();

        // Input for the second fraction
        System.out.print("Enter the second fraction (numerator/denominator): ");
        int numerator2 = scanner.nextInt();
        int denominator2 = scanner.nextInt();

        // Add the fractions and display the result
        System.out.println("The sum is: " + (numerator1 * denominator2 + numerator2 * denominator1) + "/" + (denominator1 * denominator2));

        scanner.close();
    }
}
