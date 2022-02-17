package Tamrin1;

public class Thread1 implements Runnable {
    @Override
    public void run() {
       int i = 0;
        while (true){
            try {

                System.out.println("Hello: "+i);
                i++;
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //Thread.interrupted();
                e.printStackTrace();
                break;
            }}
       /// Thread t = new Thread()

    }
}
