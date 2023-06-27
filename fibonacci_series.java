// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 
// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

import java.util.Scanner;

public class fibonacci_series {
    /**
     * @param arg
     */
    public static void main(String argc[]){
        int a=0,i,c;
        int b=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<n;i++)
        {
           System.out.print(a+"\t");
           c=a+b;
           a=b;
           b=c; 
        }
    }
}
