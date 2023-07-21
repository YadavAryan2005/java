//calculate power of number using recursion
import java.util.*;
public class num_power {
    static void num_p(int num,int pow,int sum)
    {
       if(pow==1)
        {
            System.out.println(sum);
            return;
        }
       sum=sum*num;
       num_p(num,pow-1,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        System.out.println("enter power of number");
        int pow=sc.nextInt();
        num_p(num,pow,num);
    }
}
