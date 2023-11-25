//Write a program to print the Occurrence of a Digit in a given Number in Java
import java.io.*;
import java.util.*;

class Main{

    public static void main (String[] args) 

    {
 
        int n = 898989, count = 0;

        int d = 9;

        while(n>0){
            int rem = n%10;
            if(rem == d)
                count++;
            n /= 10;
        }
        System.out.println(count);

    }

}