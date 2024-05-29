
// A) Write a socket program in Java to check whether given number is prime or not.
// Display result on client terminal.
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class slip3_A {
    public static void main(String[] args) throws Exception {
        Socket sc = new Socket("Localhost", 4000);
        DataOutputStream out = new DataOutputStream(sc.getOutputStream());
        out.writeInt(31);
        DataInputStream in = new DataInputStream(sc.getInputStream());
        String s = in.readUTF();
        System.out.println("" + s);
    }
}
