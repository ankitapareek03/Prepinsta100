import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();

        int maxHandshakes = n * (n - 1) / 2;

        System.out.println("The maximum number of handshakes is: " + maxHandshakes);

        scanner.close();
    }
}
