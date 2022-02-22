package Tamrin5B;

public class Tread5B implements Runnable{
    Object b;

    public Tread5B(Object b) {
        this.b = b;
    }

    @Override
    public void run() {
        int i = 0;
    synchronized (b){
        while (true)
        System.out.println(Thread.currentThread().getName()+"have: "+i++);
   }
    }
}
