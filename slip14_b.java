
// Write a java program to accept the details of employee (Eno, EName, Sal) and
// display it on next frame using appropriate event .
import java.awt.*;
import java.awt.event.*;

public class slip14_b extends Frame implements ActionListener {
    Label l1, l2, l3, l4;
    TextField t1, t2, t3, t4;
    Button b1;

    slip14_b() {
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        l1 = new Label("enter employee detail");
        add(l1);
        l2 = new Label("ente eno");
        add(l2);
        t1 = new TextField(20);
        add(t1);
        l3 = new Label("ente ename");
        add(l3);
        t2 = new TextField(20);
        add(t2);
        l4 = new Label("ente salary");
        add(l4);
        t3 = new TextField(20);
        add(t3);
        b1 = new Button("submit");
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        int eno = Integer.parseInt(t1.getText());
        String ename = t2.getText();
        int sal = Integer.parseInt(t3.getText());
        new next1(eno, ename, sal);
        this.dispose();
    }

    public static void main(String argv[]) {
        new slip14_b();
    }

}

class next1 extends Frame {
    Label l1, l2, l3, l4;
    TextField t1, t2, t3, t4;
    Button b1;

    next1(int eno, String ename, int sal) {
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        l1 = new Label("employee detail");
        add(l1);
        l2 = new Label("eno=");
        add(l2);
        t1 = new TextField("" + eno);
        add(t1);
        l3 = new Label("ename=");
        add(l3);
        t2 = new TextField("" + ename);
        add(t2);
        l4 = new Label("salary=");
        add(l4);
        t3 = new TextField("" + sal);
        add(t3);
    }
}
