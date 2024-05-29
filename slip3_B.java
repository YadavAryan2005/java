
//B) Write a java program using applet for bouncing ball, for each bounce color of ball should change randomly.
import java.applet.*;
import java.awt.*;

public class slip3_B extends Applet implements Runnable {
    Thread th;
    int x = 5, y = 5;
    int i = 0;

    public void init() {
        th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g) {
        if (i == 0 || i == 1) {
            g.setColor(Color.red);
        }
        if (i == 2 || i == 3) {
            g.setColor(Color.green);
        }
        if (i == 4 || i == 5) {
            g.setColor(Color.blue);
        }
        if (i == 6 || i == 7) {
            g.setColor(Color.pink);
        }
        if (i == 8 || i == 8) {
            g.setColor(Color.orange);
        }
        g.fillOval(x, y, 40, 40);
    }

    public void run() {
        while (true) {
            try {
                th.sleep(500);
                x = x + 15;
                if (i < 10)
                    i = i + 1;
                else
                    i = 0;
                if (y == 5) {
                    y = 300;
                } else {
                    y = 5;
                }
                repaint();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

}
// <applet code="slip3_B" width=500 height=500></applet>