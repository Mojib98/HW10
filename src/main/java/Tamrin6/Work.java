package Tamrin6;

public class Work extends Thread{
    @Override
    public void run() {
        synchronized (this){

          //  for (int i =0 ;i<1000;i++){
          //      System.out.println(i);
           System.out.println(Thread.currentThread().getName());

            try {
                while (true){
                    Thread.sleep(2000);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}
}
