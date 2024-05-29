
//B) Write a java program in multithreading using applet for Traffic signal.
import java.applet.*;
import java.awt.*;

public class slip5_B extends Applet implements Runnable {
    Thread th;
    int i = -1;

    public void init() {
        th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g) {
        if (i == 0) {
            g.setColor(Color.green);
            g.fillOval(30, 10, 60, 60);
        }
        if (i == 1) {
            g.setColor(Color.red);
            g.fillOval(100, 10, 60, 60);
        }
        if (i == 2) {
            g.setColor(Color.yellow);
            g.fillOval(150, 10, 60, 60);
            i = -1;
        }
    }

    public void run() {
        while (true) {
            try {
                i++;
                th.sleep(1000);
                repaint();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

}
// <applet code="slip5_B" width=500 height=500></applet>