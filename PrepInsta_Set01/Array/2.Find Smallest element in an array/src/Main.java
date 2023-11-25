
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int arr[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}

		int min = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
       System.out.println("Smallest number is : "+ min);
	}

}
