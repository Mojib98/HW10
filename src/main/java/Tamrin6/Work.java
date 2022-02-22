package Tamrin6;

public class Work extends Thread{
    @Override
    public void run() {
        synchronized (this){

          //  for (int i =0 ;i<1000;i++){
          //      System.out.println(i);
           System.out.println(Thread.currentThread().getName());


                synchronized (this){
              // while (true){
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + " End");
                }


        }
    }}//}

