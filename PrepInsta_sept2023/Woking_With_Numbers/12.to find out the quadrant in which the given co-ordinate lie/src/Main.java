import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x-coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter the y-coordinate: ");
        int y = scanner.nextInt();

        String quadrant = identifyQuadrant(x, y);
        System.out.println("Quadrant: " + quadrant);

        scanner.close();
    }

    public static String identifyQuadrant(int x, int y) {
        if (x == 0 || y == 0) {
            return (x == 0) ? "On the y-axis" : "On the x-axis";
        }
        
        return (x > 0) ? ((y > 0) ? "Quadrant I" : "Quadrant IV") : ((y > 0) ? "Quadrant II" : "Quadrant III");
    }
}
