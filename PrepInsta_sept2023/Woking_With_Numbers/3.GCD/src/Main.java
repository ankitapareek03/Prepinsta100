import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int gcd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		num1 = sc.nextInt();
		System.out.println("Enter Scecond number : ");
		num2 = sc.nextInt();
		
		for (int i = 1 ; i <= num1 || i <= num2 ; i++) {
			if(num1 %i == 0 && num2 %i ==0)
				gcd = i;
		}
		System.out.println("HCF IS :"+ gcd);

	}

}
