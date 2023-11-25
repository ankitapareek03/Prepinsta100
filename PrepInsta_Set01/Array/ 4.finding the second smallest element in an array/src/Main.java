
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
		int smallest = Integer.MAX_VALUE;
        int sec_smallest = Integer.MAX_VALUE;
	
		for(int i =0; i<arr.length;i++) {
			if (arr[i] < smallest) {
			sec_smallest = smallest;	
		    smallest = arr[i];
			}
			else if(arr[i] < sec_smallest ) {
				sec_smallest = arr [i];
			}
		}
		System.out.println("second smallest number is :"+ sec_smallest);
		
	}
}


/*
When dealing with integer values and you need to find the maximum or minimum value,
you can use Integer.MAX_VALUE or Integer.MIN_VALUE respectively as 
starting points for comparisons. This is especially useful when searching 
for extreme values within a collection of integers.

*/









