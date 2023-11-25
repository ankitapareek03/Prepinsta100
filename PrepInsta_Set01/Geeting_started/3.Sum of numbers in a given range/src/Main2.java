/*
Find the Sum of the Numbers in a Given Range in Java

Method 3: Using Recursion

Initialize the required variable sum = 0.
Define a recursive function with base case as number1 == number2.
Set the recursive set call as num1+ function(sum,num1+1,num2).
print the returned value after calling the recursive functions.
*/


class Main2 {
	public static void main(String[]args) {
		int a= 6;
		int b =12;
        int sum = getSum (0,a,b);
        	System.out.println("The sum is :" + sum);
	}
        static int getSum (int sum, int i , int b) {
        	if (i>b)
        		return sum;
        	return i + getSum (sum,i+1,b);
        }
	}

