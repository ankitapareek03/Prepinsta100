import java.util.Scanner;

public class Main {
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertToWords(int num) {
        if (num < 10) return units[num];
        if (num < 20) return teens[num - 11];
        if (num < 100) return tens[num / 10] + " " + convertToWords(num % 10);
        if (num < 1000) return units[num / 100] + " Hundred " + convertToWords(num % 100);
        if (num < 1000000) return convertToWords(num / 1000) + " Thousand " + convertToWords(num % 1000);
        return convertToWords(num / 1000000) + " Million " + convertToWords(num % 1000000);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            System.out.println("In words: " + convertToWords(number));
        }

        scanner.close();
    }
}
