import java.io.*;

public class slip22 {
    public static void main(String[] args) {
        try {
            File file = new File("aryan.txt");
            File f1 = new File("sachin.txt");
            System.out.println(file.renameTo(f1));

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
