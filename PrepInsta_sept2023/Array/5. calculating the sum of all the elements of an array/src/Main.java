
import java.util.Scanner;

public class Main{
	
	  public static int calculateSum(int[] arr, int index) {
	        if (index <= 0) {
	            return 0;
	        }
	        return calculateSum(arr,index-1) + arr[index-1];
	  }
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = calculateSum(arr,n);
	
		System.out.println("sum of array elements is :"+ sum);
		
	}
}












