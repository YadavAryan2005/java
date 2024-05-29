
import java.awt.*;
import java.awt.event.*;

class slip20_2 extends Frame implements WindowListener {
    slip20_2() {
        setVisible(true);
        setSize(300, 300);
        addWindowListener(this);
    }

    public void windowClosed(WindowEvent event) {
        dispose();
    }

    public void windowOpened(WindowEvent event) {
    }

    public void windowExited(WindowEvent event) {
    }

    public void windowResized(WindowEvent event) {
    }

    public void windowDeactivated(WindowEvent event) {
    }

    public void windowActivated(WindowEvent event) {
    }

    public void windowDeiconified(WindowEvent event) {
    }

    public void windowIconified(WindowEvent event) {
    }

    public void windowClosing(WindowEvent event) {
        dispose();
    }

    public static void main(String[] args) {
        new slip20_2();
    }
}
