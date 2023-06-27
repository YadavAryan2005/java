//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;
public class curcumference_circle {
    public static double circumference(float r)
    {
       double a=2*3.14*r;
       return a;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double cir=circumference(radius);
        System.out.println("circumference of circle 4is:"+cir);
    }
}
