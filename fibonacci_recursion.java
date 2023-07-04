//diaplay fibonacci series of nth term
import java.util.Scanner;

public class fibonacci_recursion {
    public static void fibonacci(int a,int b,int n)
    {
       if(n==0)
       return;
       System.out.println(a+" ");
       int c=a+b;
       a=b;
       b=c;
       fibonacci(a, b, n-1);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter fibonacci seris limit");
      int n=sc.nextInt();
      fibonacci(0, 1, n);
    }
}
