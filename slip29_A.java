// A) Write a java program using multithreading for the following:
// 1. Display all the odd numbers between 1 to n.
// 2. Display all the prime numbers between 1 to n.
class odd extends Thread {
    int n;

    odd(int no) {
        n = no;
        start();
    }

    public void run() {
        System.out.println("even" + n);
    }
}

class prime extends Thread {
    int n;

    prime(int no) {
        n = no;
        start();
    }

    public void run() {
        System.out.println("prime" + n);
    }
}

public class slip29_A {
    public static void main(String[] args) {
        for (int i = 2; i < 50; i++) {
            int k = 0;
            if (i % 2 == 0) {
                new odd(i);
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    k = 1;
                }
            }
            if (k == 0) {
                new prime(i);
            }

        }
    }
}
