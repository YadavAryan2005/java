
// )\ Write a java program to display ASCII values of the characters from a file.
import java.io.*;

class slip22_1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("abc.txt");
            int k;
            while ((k = fis.read()) != -1) {
                System.out.println((int) k);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}