import java.awt.*;
import java.applet.*;

public class smiley extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.black);
        g.fillOval(90, 90, 20, 20);
        g.drawOval(93, 90, 14, 19);
        g.fillOval(190, 90, 20, 20);
        g.drawArc(130, 160, 40, 40, 0, -180);
    }
}
/* <applet code="smiley.class" width=500 height=500></applet> */