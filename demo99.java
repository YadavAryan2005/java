import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class demo99 extends JFrame implements ActionListener {
    JButton b1;
    JTextField l1;

    demo99() {
        setVisible(true);
        setSize(400, 500);
        setLayout(new FlowLayout());
        l1 = new JTextField("enter name");
        add(l1);
        b1 = new JButton("change");
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        l1.setText("aryan");
    }

    public static void main(String[] args) {
        new demo99();
    }
}
