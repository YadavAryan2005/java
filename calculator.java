import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class calculator extends Applet implements ActionListener {
    Label l1;
    float n1, n2, result;
    String ch = " ";
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, bdiv, bdot, bequal, bclear;
    TextField t1;
    Panel p1;

    public void init() {
        setVisible(true);
        setSize(500, 400);
        setLayout(new FlowLayout());
        t1 = new TextField(15);
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");
        badd = new Button("+");
        bsub = new Button("-");
        bmul = new Button("*");
        bdiv = new Button("/");
        bdot = new Button(".");
        bequal = new Button("=");
        bclear = new Button("clear");
        p1 = new Panel();
        p1.setLayout(new GridLayout(5, 4, 3, 3));
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(badd);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(bsub);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(bmul);
        p1.add(b0);
        p1.add(bdot);
        p1.add(bequal);
        p1.add(bdiv);
        p1.add(bclear);
        add(t1);
        add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bdot.addActionListener(this);
        bequal.addActionListener(this);
        bclear.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bclear) {
            t1.setText("");
        }
        if (ae.getSource() == b1)
            t1.setText(t1.getText() + "1");
        if (ae.getSource() == b2)
            t1.setText(t1.getText() + "2");
        if (ae.getSource() == b3)
            t1.setText(t1.getText() + "3");
        if (ae.getSource() == b4)
            t1.setText(t1.getText() + "4");
        if (ae.getSource() == b5)
            t1.setText(t1.getText() + "5");
        if (ae.getSource() == b6)
            t1.setText(t1.getText() + "6");
        if (ae.getSource() == b7)
            t1.setText(t1.getText() + "7");
        if (ae.getSource() == b8)
            t1.setText(t1.getText() + "8");
        if (ae.getSource() == b9)
            t1.setText(t1.getText() + "9");
        if (ae.getSource() == b0)
            t1.setText(t1.getText() + "0");
        if (ae.getSource() == bdot)
            t1.setText(t1.getText() + ".");
        if (ae.getSource() == badd) {
            ch = "+";
            n1 = Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if (ae.getSource() == bsub) {
            ch = "-";
            n1 = Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if (ae.getSource() == bmul) {
            ch = "*";
            n1 = Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if (ae.getSource() == bdiv) {
            ch = "/";
            n1 = Float.parseFloat(t1.getText());
            t1.setText("");
        }
        if (ae.getSource() == bequal) {
            n2 = Float.parseFloat(t1.getText());
            switch (ch) {
                case "+":
                    result = n1 + n2;
                    t1.setText("" + result);
                    break;
                case "-":
                    result = n1 - n2;
                    t1.setText("" + result);
                    break;
                case "*":
                    result = n1 * n2;
                    t1.setText("" + result);
                    break;
                case "/":
                    result = n1 / n2;
                    t1.setText("" + result);
                    break;
            }
        }

    }
}
/* <applet code="calculator.class" width=300 height=500 ></applet> */
