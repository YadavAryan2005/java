import java.awt.*;
import java.applet.*;

// <applet code="slip26_b.class" width="500" height="500"></applet>
public class slip26_b extends Applet {
    public void paint(Graphics g) {
        g.drawRect(200, 200, 200, 200);
        g.drawLine(200, 200, 300, 100);
        g.drawLine(300, 100, 300, 50);
        g.drawLine(300, 50, 330, 65);
        g.drawLine(300, 80, 330, 65);
        g.drawRect(275, 300, 50, 100);
    }
}
