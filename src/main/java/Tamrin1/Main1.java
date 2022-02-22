package Tamrin1;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new
                Thread1());
        t.start();
        Thread.sleep(2000);
        t.interrupt();

    }
}
