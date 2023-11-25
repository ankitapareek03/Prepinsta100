
import java.util.*;

public class Main{
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		n= sc.nextInt();
		
		if(n <= 0) {
			System.out.println("Array size should be greater than zero");
			System.exit(0);
		}
		ArrayList<Integer>arr = new ArrayList<>();
		
		System.out.println("Enter array elements : ");
		
		for (int i =0; i<n;i++) {
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		
		
		for(int i=0;i<n;i++) {
			System.out.println(arr.get(i));
		}
		Set<Integer>freq = new HashSet<Integer>(arr);
		
		for (Integer i : freq) {
			System.out.println(i +":"+Collections.frequency(arr, i));
		}
	} 
	
	
}











