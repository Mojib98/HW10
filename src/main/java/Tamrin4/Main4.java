package Tamrin4;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main4 {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        File file = new File("/home/arkad/Music");
        File[] filesInFolder = file.listFiles();
        Queue<File> queue = new LinkedList<>(Arrays.asList(filesInFolder));
        CountSize c = new CountSize(queue);
     //   for (int i = 0 ;i<20;i++){
        while (!queue.isEmpty()){
        executorService.submit(c);
        executorService.submit(c);
        executorService.submit(c);
        executorService.submit(c);
        executorService.submit(c);

        }
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
        executorService.shutdown();
        executorService.shutdown();
        executorService.shutdown();
        executorService.shutdown();
        //c.s();
        System.out.println(Thread.currentThread());
      //  Thread.sleep(1000);
        System.out.println("show");
        System.out.println(c.size);
    }
}
