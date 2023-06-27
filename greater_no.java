//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class greater_no {
    public static int greater(int a,int b)
    {
        if(a>b)
         return a;
        else
         return b;
    }
    public static void main(String argc[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=greater(a,b);
        System.out.println("greater no:"+c);
    }
}
