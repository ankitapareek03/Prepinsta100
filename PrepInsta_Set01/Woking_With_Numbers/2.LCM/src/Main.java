import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		num1 = sc.nextInt();
		System.out.println("Enter Scecond number : ");
		num2 = sc.nextInt();
		
		int lcm = (num1 > num2) ? num1 : num2;
		
		while (true ) {
			if (lcm % num1 == 0 && lcm %num2 == 0)
				break;
			else 
				lcm ++;
		}
		System.out.println("LCM IS : "+ lcm);
	}

}
