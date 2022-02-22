package Tamrin6B;

public class WorkerB6B implements Runnable{
    int x = 0;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start");
        int cpus = Runtime.getRuntime().availableProcessors();
        System.out.println(cpus);

        synchronized (this){
            System.out.println(x);
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println(Thread.currentThread().getName()+" seting");
        this.x = x;
    }
}
