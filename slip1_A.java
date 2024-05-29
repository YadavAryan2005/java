
//A) Write a java program to scroll the text from left to right and vice versa continuously.
import java.applet.*;
import java.awt.*;

public class slip1_A extends Applet implements Runnable {
    int x = 0, y = 20;
    Thread th;

    public void init() {
        th = new Thread(this);
        th.start();
    }

    public void run() {
        try {
            while (true) {
                if (x == 480) {
                    while (x != 5) {
                        x = x - 5;
                        th.sleep(30);
                        repaint();
                    }
                }
                x = x + 5;
                th.sleep(30);
                repaint();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public void paint(Graphics g) {
        g.drawString("Aryan", x, y);
    }
}
/* <applet code="slip1_A" height="500" width=500></applet> */