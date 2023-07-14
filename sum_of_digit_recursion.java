//Write a Java program to calculate sum of digits of a number using Recursion.
import java.util.*;
public class sum_of_digit_recursion {
    public static void suma(int num,int sum)
    {
        
        if(num>0)
        {
         int d=num%10;
         sum=sum+d;
         num=(num/10);
         suma(num,sum);   
        }
        else{
        System.out.println(sum);
        return;
        }
        

    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     suma(num,0);
    }
}
