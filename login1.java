import java.applet.*;
import java.awt.*;

public class login1 extends Applet {
    Label l1, l2;
    TextField t1, t2;
    Button b1;

    public void init() {
        setVisible(true);
        setLayout(new FlowLayout());
        l1 = new Label("enter username");
        add(l1);
        t1 = new TextField(20);
        add(t1);
        l2 = new Label("enter password");
        add(l2);
        t2 = new TextField(20);
        add(t2);
        b1 = new Button("submit");
        add(b1);
    }
}
// <applet code="login1.class" width=500 height=500></applet>
