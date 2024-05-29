
// B) Construct a Linked List containing name: CPP, Java, Python and PHP. Then
// extend your java program to do the following:
// i. Display the contents of the List using an Iterator
// ii. Display the contents of the List in reverse order using a ListIterator
import java.util.*;

public class slip20_1 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("cpp");
        l1.add("java");
        l1.add("python");
        l1.add("php");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice...");
        int ch = sc.nextInt();
        Iterator it = l1.iterator();
        if (ch == 1) {
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
        if (ch == 2) {
            ListIterator iti = l1.listIterator();
            while (iti.hasPrevious()) {
                System.out.println(iti.previous());
            }
        }
    }
}
