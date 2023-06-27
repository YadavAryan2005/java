//Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
class average
{
  public static int avarage(int a,int b,int c){
    return (a+b+c)/3;
  }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int avg=avarage(a,b,c);
      System.out.println("avarage of 3 number:"+avg);
    }
}