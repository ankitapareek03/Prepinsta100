/*
 * Java Program to Check Leap Year or not
 * 
 * Method 3: Using Ternary Operator
 */
import java.util.Scanner;
public class Main2 {
    public static void main(String args[])
    {

    	 Scanner sc = new Scanner (System.in);
    	 System.out.println("Enter the year :");
    	 int year = sc.nextInt();
    	    
         int flag = (year%400 == 0) || (year%4==0 && year%100!=0 ) ? 1 : 0;
        if (flag ==1)
        
            System.out.println (year + " is a Leap Year");
        
        else
        
             System.out.println (year + " is not a Leap Year");

}
}