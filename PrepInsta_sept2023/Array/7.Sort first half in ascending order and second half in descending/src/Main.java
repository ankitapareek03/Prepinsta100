
import java.util.*;

public class Main{
	public static void main(String[]args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		n = sc.nextInt();
		if(n <= 0) {
			System.out.println("Array size should be greater than zero");
			System.exit(0);
		}
		
		int n1 = n%2 ==0 ? (n/2) : (n/2)+1;
		int n2 = n - n1;
		
		ArrayList<Integer>first = new ArrayList<>();
		ArrayList<Integer>second= new ArrayList<>();
		
		System.out.println("Enter the array elements : ");
		
	for (int i =0;i<n1;i++)
		first.add(sc.nextInt());
	
	for(int i =0;i< n2;i++)
		second.add(sc.nextInt());
	
	Collections.sort(first);
	Collections.sort(second,Collections.reverseOrder());
	
	for(int i =0;i<n1;i++)
		System.out.println(first.get(i));
	
	for(int i =0; i<n2;i++)
		System.out.println(second.get(i));
	
		
	}
}











