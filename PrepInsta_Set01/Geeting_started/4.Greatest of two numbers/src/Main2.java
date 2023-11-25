/*
 * Java Program to Find Greatest of Two Numbers
 * 
 * Method 3: Using inbuilt max Function
 */
public class Main2 {
    public static void main(String args[])
    {
        int num1 = 12, num2 = 21;
        if (num1 == num2)
            System.out.println("both are equal");
        else
            System.out.println(Math.max(num1, num2) + " is greater");
    }
}