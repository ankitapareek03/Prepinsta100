import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        String octal = Integer.toOctalString(Integer.parseInt(binaryString, 2));

        System.out.println("Octal equivalent: " + octal);
        scanner.close();
    }
}