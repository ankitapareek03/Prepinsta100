
/*
 import java.util.*;
 

public class Main{
	public static void main(String args[] ) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out .println("Enter array size ");
		n = sc.nextInt();
		
		if (n <= 0) {
			System.out.println("Array size should be greater than zaro");
			System.exit(0);
		}
		
		Map<Integer,Integer> mp = new HashMap<>();
		Scanner in = new Scanner(System.in);
		
		for (int i =0; i<n;i++) {
			Integer a = in.nextInt();
			mp.put(a, a);
		}
		for (int i=0;i<n;i++) {
			mp.put(arr[i],mp.get)
		}
		
	}
}
*/

/*
ArrayList<Integer>arr = new ArrayList<>();
System.out.println("Enter array elements :");
for (int i =0; i<n;i++) {
	arr.add(sc.nextInt());
}
*/




import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    	System.out.println("Enter array elements :");
        HashMap<Integer, String> hmap = new HashMap<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            Integer a = in.nextInt();
            String b = in.next();

            hmap.put(a, b);
        }

        for (Map.Entry<Integer, String> m : hmap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}


