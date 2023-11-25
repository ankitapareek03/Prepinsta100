import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int arr[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements : ");
		for (int i = 0; i < 6; i++) {
			arr[i]= sc.nextInt();
		}
		int max;
		max = arr[0];
		for(int i=1; i<6;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
       System.out.println("Largeest number is : "+ max);
	}

}
