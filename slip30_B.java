
// B) Write a java program in multithreading using applet for moving car.
import java.applet.*;
import java.awt.*;

public class slip30_B extends Applet implements Runnable {
    Thread th;
    int x, x1, x2;

    public void init() {
        th = new Thread(this);
        x = 20;
        x1 = 30;
        x2 = 80;
        th.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x, 20, 110, 40);
        g.setColor(Color.black);
        g.fillOval(x1, 45, 30, 30);
        g.setColor(Color.black);
        g.fillOval(x2, 45, 30, 30);
    }

    public void run() {
        try {
            while (true) {
                th.sleep(100);
                x++;
                x1++;
                x2++;
                repaint();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
// <applet code="slip30_B" width=500 height=500></applet>