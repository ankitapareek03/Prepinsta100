//Find the Sum of the Numbers in a Given Range in Java

//Method 2: Using the Formula

//Apply the given formula sum = b*(b+1)/2 – a*(a+1)/2 + a.

class Main1 {
	public static void main(String[]args) {
		int a= 6;
		int b =10;
        int sum = b*(b+1)/2 - a*(a+1)/2 +a;
        System.out.println("The sum is "+ sum);
	}
}
