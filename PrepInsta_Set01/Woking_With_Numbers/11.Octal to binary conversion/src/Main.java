import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalNumber = scanner.nextLine();

        System.out.println("Binary equivalent: " + Integer.toBinaryString(Integer.parseInt(octalNumber, 8)));

        scanner.close();
    }
}
