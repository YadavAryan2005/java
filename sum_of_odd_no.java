//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class sum_of_odd_no {
    public static void sumodd(int n)
    {
       int s=0;
       for(int i=0;i<n;i++)
       {
         if(i%2!=0)
         s=s+i;
       }
       System.out.println("addition of odd numbers is:"+s);
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     sumodd(n); 
    }
}
