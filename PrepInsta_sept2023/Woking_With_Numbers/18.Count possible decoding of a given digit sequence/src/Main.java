import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit sequence: ");
        String digitSequence = sc.nextLine();

        int count = countDecodings(digitSequence);
        System.out.println("Number of possible decodings: " + count);

        sc.close();
    }

    private static int countDecodings(String digits) {
        if (digits.length() == 0) {
            return 1; 
        }

        char firstDigit = digits.charAt(0);

        if (firstDigit == '0') {
            return 0;
        }

        int count = countDecodings(digits.substring(1));

        if (digits.length() >= 2) {
            int twoDigit = Integer.parseInt(digits.substring(0, 2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                count += countDecodings(digits.substring(2));
            }
        }

        return count;
    }
}
