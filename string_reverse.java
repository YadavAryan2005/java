import java.util.Scanner;

public class string_reverse {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.nextLine();
        StringBuffer s2=new StringBuffer(s1);
         s2.reverse();
        String s3=new String(s2);
        System.out.println(s3);
        if(s1.equals(s3))
        {
            System.out.println("string palindrome");    
        }
        else
        {
            System.out.println("string not palindrome");
        }  
    }
}
