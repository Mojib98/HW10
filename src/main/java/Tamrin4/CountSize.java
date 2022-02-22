package Tamrin4;

import java.io.File;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Semaphore;

public class CountSize extends Thread{
    //Thread t;
    Semaphore semaphore;
     volatile Long size;
     volatile Long size2;
    Queue<File> queue;

    public CountSize(Queue<File> queue) {

        semaphore = new Semaphore(5);
    //    t = new Thread();
        this.queue = queue;
        size= 0L;
        size2=0L;
    }
    @Override
    public void run() {

        //File file = new File("/home/arkad/Music");
      //  File[] filesInFolder = file.listFiles();
     //   Queue<File> queue = new LinkedList<>(Arrays.asList(filesInFolder));
     //   BlockingDeque<File> blockingDeque = new ArrayBlockingQueue<File>(Arrays.asList(filesInFolder));
        System.out.println("befor ac");
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (File e:queue
                     ) {

                 // if (!e.isFile()){
                System.out.println(currentThread().getName());
             //    Thread.sleep(100);
              //  size +=e.length();
                size +=queue.poll().length();
           //     size2 +=blockingDeque.poll().length();
                semaphore.release();}
        System.out.println(queue.poll());
          //  size +=listt.poll().length();
         //   size+=queue.poll().length();

           //     System.out.println("after release");
       // }}
}



public void s(){
    System.out.println(size);

}

    public Long getSize() {
        return size;
    }
}
