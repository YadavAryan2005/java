import java.io.DataInputStream;
import java.net.*;
import java.io.*;

public class slip3_A1 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(4000);
        Socket s = ss.accept();
        DataInputStream in = new DataInputStream(s.getInputStream());
        int n = in.readInt();
        int k = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                k = 1;
        }
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        if (k == 1)
            out.writeUTF("NOT PRIME");
        else
            out.writeUTF("PRIME");
    }
}
