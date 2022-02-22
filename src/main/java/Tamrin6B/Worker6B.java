package Tamrin6B;

public class Worker6B implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start");
         int cpus = Runtime.getRuntime().availableProcessors();
        System.out.println(cpus);
        synchronized (this){
            while (true);
        }
    }
}
