package Tamrin6B;

public class WorkerB6 implements Runnable{
    int x = 0;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start");
        int cpus = Runtime.getRuntime().availableProcessors();
        System.out.println(cpus);

        synchronized (this){
            while (true)
                x++;
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
