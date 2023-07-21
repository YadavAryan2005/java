//write a java program to accept a numbe from a user if it less than 5 than throw user define exception "number is small" if it is greater  than 10 than throw user definded exception "number is greater " otherwise calculate its factorials
import java.util.*;
class noisless extends Exception
{
public String toString()
{
    return"no is small";
}
}
class noislarge extends Exception
{
public String toString()
{
    return"no is greater";
}
}
public class exception2 {
    static void factorial(int a)
    {
        int s=1;
        while(a>0)
        {
            s=a*s;
            a--;
        }
        System.out.println("factorial is"+s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try{
            if(a<5)
            throw new noisless();
            else if(a>10)
            throw new noislarge();
            else
            factorial(a);
        }
        catch(noisless e)
        {
         System.out.println(e);
        }
        catch(noislarge h)
        {
            System.out.println(h);
        }
    }
    
}
