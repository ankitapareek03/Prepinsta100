
/*
 * Java Program to print Prime numbers in a given range

// Time Complexity : O(N)
// Space Complexity : O(1)
import java.util.Scanner;
*/
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		int n1;
		int n2;
		int i;
		int j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter staring number :");
		n1 = sc.nextInt();
		System.out.println("Enter ending number :");
		n2 = sc.nextInt();
		
		for(i = n1; i <= n2; i++) {
			for(j = 2; j <= i;j++) {
				if (i%j ==0)
					break;
			}
			if(i ==j)
				System.out.println(j+" ");
		}

	}

}