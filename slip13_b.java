
// Write a java program to accept ‘n’ integers from the user & store them in an
// ArrayList collection. Display the elements of ArrayList collection in reverse order
import java.util.*;

public class slip13_b {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("enter no");
        int n = sc.nextInt();
        for (i = 0; i < n; i++) {
            int no = sc.nextInt();
            al.add(no);
        }
        Collections.reverse(al);
        System.out.print(al);
    }
}
