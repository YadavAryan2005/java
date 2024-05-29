//A) Write a java program for the implementation of synchronization.
class A extends Thread {
    int n;

    A(int no) {
        n = no;
    }

    public void run() {
        System.out.println(n);
    }
}

public class slip28_A extends Thread {
    slip28_A() {
        start();
    }

    synchronized public void run() {
        for (int i = 0; i < 10; i++) {
            Thread th = new Thread(new A(i));
            th.start();
        }
    }

    public static void main(String[] args) {
        new slip28_A();
    }
}
