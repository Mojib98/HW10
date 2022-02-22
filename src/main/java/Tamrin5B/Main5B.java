package Tamrin5B;

public class Main5B {
    public static void main(String[] args) {
        Object o = new Object();
        Tread5B tread5B = new Tread5B(o);
        Tread5B tread5B2 = new Tread5B(o);
        Thread t1 = new Thread(tread5B2);
        Thread t2 = new Thread(tread5B);
        t1.start();
        t2.start();
    }
}
