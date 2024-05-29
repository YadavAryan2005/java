import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*  <applet code="login.class" width="200" height="300"
 </applet>*/
public class login extends Applet {
    Label l1, l2;
    TextField t1, t2;
    Button b1;

    public void init() {
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