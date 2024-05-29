
//B) Write a java program in multithreading using applet for drawing flag.
import java.applet.*;
import java.awt.*;

public class slip2_B extends Applet implements Runnable {
    Thread th;
    int x = 100, x1 = 100, x2 = 100, x3 = 100, x4 = 100;
    int y = 150, y1 = 50, y2 = 150, y3 = 210, y4 = 50;

    public void init() {
        th = new Thread(this);
        th.start();
    }

    public void update(Graphics g) {
        g.drawLine(x, y, x, y);
        g.drawLine(x1, y1, x1, y1);
        g.drawLine(x2, y2, x2, y2);
        g.drawLine(x3, y3, x3, y3);
        g.drawLine(x4, y4, x4, y4);
    }

    public void run() {
        try {
            while (true) {
                while (x != 200) {
                    x = x + 5;
                    y = y - 5;
                    th.sleep(800);
                    repaint();
                }
                while (x1 != 200) {
                    x1 = x1 + 5;
                    th.sleep(800);
                    repaint();
                }
                while (x2 != 200) {
                    x2 = x2 + 5;
                    y2 = y2 + 3;
                    th.sleep(800);
                    repaint();
                }
                while (x3 != 200) {
                    x3 = x3 + 5;
                    th.sleep(800);
                    repaint();
                }
                while (y4 != 500) {
                    y4 = y4 + 5;
                    th.sleep(800);
                    repaint();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
// <applet code="slip2_B" height="500" width="500"></applet>