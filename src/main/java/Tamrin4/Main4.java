package Tamrin4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main4 {
    public static void main(String[] args) throws InterruptedException {
        CountSize c = new CountSize();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
     //   for (int i = 0 ;i<20;i++){
        executorService.submit(c);
        executorService.submit(c);
        executorService.submit(c);
        executorService.submit(c);
    //    executorService.submit(c);
     //   executorService.submit(c);
      // }
       // executorService.submit(c);
       // executorService.submit(c);
       // executorService.submit(c);
       // executorService.submit(c);
       // c.s();
        //c.join();
        executorService.shutdown();
        //c.s();
        Thread.sleep(1000);
        System.out.println("show");
        System.out.println(c.size);
    }
}
