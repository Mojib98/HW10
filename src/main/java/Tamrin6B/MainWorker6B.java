package Tamrin6B;

public class MainWorker6B {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker6B());
        Thread t2 = new Thread(new Worker6B());
        WorkerB6 workerB6 = new WorkerB6();
        WorkerB6B workerB62 = new WorkerB6B();

        workerB6.setX(1);
        Thread t3 = new Thread(workerB6);
        t3.start();
        workerB62.setX(workerB6.getX());
        Thread t4 = new Thread(workerB62);
        t4.start();
        System.out.println("Start Main");
        //t1.start();
        //t2.start();
     //   t3.start();
     //   t4.start();
    //   int d= workerB6.getX();
      //  int s =
        System.out.println("End Main");
    }
}
