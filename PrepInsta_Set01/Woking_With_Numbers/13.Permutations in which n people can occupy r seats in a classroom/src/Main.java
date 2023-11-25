import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of seats (r): ");
        int r = scanner.nextInt();

        System.out.println("Permutations:");
        generatePermutations(n, r, new int[r], 0);

        scanner.close();
    }

    public static void generatePermutations(int n, int r, int[] permutation, int depth) {
        if (depth == r) {
            for (int i : permutation) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            permutation[depth] = i;
            generatePermutations(n, r, permutation, depth + 1);
        }
    }
}
