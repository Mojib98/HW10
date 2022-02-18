package Tamrin1;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new
                Thread1());
       // for(int i =0;i<20;i++){
            t.start();
            Thread.sleep(2000);
             t.interrupt();
          //  Thread.interrupted();
       // }
    }
}
