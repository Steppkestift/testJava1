/**
 * Created by heiko-linke on 07.07.14.
 */
public class testJava implements Runnable {
    private int i;

    public synchronized void run() {
        if (i % 5 != 0) {
            i++;
        }
        for (int x = 0; x < 5; x++, i++) {
            if (x > i) Thread.yield();
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        testJava n = new testJava();
        for (int x = 100; x > 0; --x) {
            new Thread(n).start();
        }

    }
}
