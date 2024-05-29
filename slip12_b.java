
// B) Write a java program to display multiplication table of a given number into the List
// // box by clicking on button
import java.awt.*;
import java.awt.event.*;

public class slip12_b extends Frame implements ActionListener {
    List li;
    Label l1;
    TextField t1;
    Button b1;

    slip12_b() {
        setVisible(true);
        setSize(400, 500);
        setLayout(new FlowLayout());
        l1 = new Label("enter number");
        add(l1);
        t1 = new TextField(20);
        add(t1);
        li = new List(10);
        add(li);
        b1 = new Button("click");
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        int n = Integer.parseInt(t1.getText());
        int no;
        for (int i = 1; i <= 10; i++) {
            no = i * n;
            li.add("" + no);
        }
    }

    public static void main(String argv[]) {
        new slip12_b();
    }
}
