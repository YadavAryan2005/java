
// Write a java program to display Label with text “Dr. D Y Patil College”,
// background color Red and font size 20 on the frame
import java.awt.*;

public class slip7_A extends Frame {
    Label l1;

    slip7_A() {
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400, 500);
        l1 = new Label("Dr. D Y Patil College");
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        add(l1);
    }

    public static void main(String[] args) {
        new slip7_A();
    }
}