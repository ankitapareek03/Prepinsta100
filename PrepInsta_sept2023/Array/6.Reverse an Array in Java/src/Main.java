
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.print("Enter the array elements : ");
		
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int start = 0;
		int end = n-1;
		
		while(start < end ) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
		 for (int i =0; i<n; i++)
			 System.out.print(arr[i]+" ");
		
	}
}











