
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i =0; i<arr.length;i++) {
			if (arr[i] > max)
				 max = arr[i];
	
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Largest elelment is : "+max);
		System.out.println("Smallest element is : "+min);
	}
}
