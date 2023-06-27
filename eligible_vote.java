//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;
public class eligible_vote {
    public static void eligible(int age)
    {
        if(age<18)
         System.out.println("not eligible for vote");
        else
         System.out.println("eligible for vote");
    }
    public static void main(String argc[])
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        eligible(age);
    }
}
