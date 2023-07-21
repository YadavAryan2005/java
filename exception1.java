//accept age from user if age less then 0 throw userdefin exception "negative age exception" otherwise check voter or not
import java.util.*;

class negativeage extends Exception {
    public String toString() {
        return "age is less than zero";
    }
}

public class exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int a = sc.nextInt();
        try{
            if (a < 0)
                throw new negativeage();
            else if (a < 18)
                System.out.println("not voter");
            else
                System.out.println("you are voter");
        }catch (negativeage e) {
            System.out.println(e);
        }
    }
}