//write a java program to validate pan number. if it is invalid then throw user defined exeption "inbalid data" otherwise display it
import java.util.Scanner;

class pan extends Exception
{
    public String toString()
    {
        return"invald pan";
    }
}
public class exception3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i;
        try
        {
        for(i=0;i<=4;i++)
        {
            if(!Character.isUpperCase(s.charAt(i)))
                throw new pan();
        }
        for(i=5;i<=8;i++)
        {
            if(!Character.isDigit(s.charAt(i)))
            throw new pan();
        }
        if(!Character.isUpperCase(s.charAt(9)))
        throw new pan();
        else
        System.out.println("valid pan");
    }
    catch(pan p)
    {
        System.out.println(p);
    }
    }
    
}
