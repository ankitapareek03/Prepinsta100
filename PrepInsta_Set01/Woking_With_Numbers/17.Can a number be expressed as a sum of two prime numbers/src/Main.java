import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an even number greater than 2: ");
        int number = scanner.nextInt();

        boolean isGoldbach = number > 2 && number % 2 == 0 && checkGoldbachConjecture(number);

        System.out.println(isGoldbach ? number + " can be expressed as the sum of two prime numbers."
                : number + " cannot be expressed as the sum of two prime numbers.");

        scanner.close();
    }
    private static boolean checkGoldbachConjecture(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPrime(int n) {
        return n > 1 && java.math.BigInteger.valueOf(n).isProbablePrime(50);
    }
}
