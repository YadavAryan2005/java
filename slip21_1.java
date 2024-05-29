import java.util.*;

public class slip21_1 {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>();
        table.put("shrirampur", "2001412");
        table.put("rahuri", "2211412");
        table.put("rahata", "2001410");
        table.put("shirdi", "2201412");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter city for search");
        String city = sc.next();
        String code = table.get(city);
        System.out.println(code);
        System.out.println(table);
    }
}
