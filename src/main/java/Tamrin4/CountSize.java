package Tamrin4;

import java.io.File;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Semaphore;

public class CountSize extends Thread{
    //Thread t;
    Semaphore semaphore;
     volatile Long size;

    public CountSize() {

        semaphore = new Semaphore(5);
    //    t = new Thread();
    }
    @Override
    public void run() {
         size= 0L;
        File file = new File("/home/arkad/Music");
       // Scanner scanner = new Scanner("/IdeaProjects/Hw/HW10/src/Tamrin4/cal");

        File[] filesInFolder = file.listFiles();
        Queue<File> queue = new LinkedList<>(Arrays.asList(filesInFolder));
      //  ArrayBlockingQueue<File> listt=new ArrayBlockingQueue<>(Arrays.asList(Optional.of(filesInFolder)));
       // System.out.println(filesInFolder);
        System.out.println("befor ac");

            while (!queue.isEmpty()){
                //         semaphore.acquire();
                //      for (File e:filesInFolder
        //     ) {
          //  if (e.isFile()){
                System.out.println(currentThread().getName());
                // Thread.sleep(100);
              //  size +=e.length();
                size +=queue.poll().length();
     //   semaphore.release();
          //  System.out.println(size);*

         //*/
        System.out.println(queue.poll());
          //  size +=listt.poll().length();
         //   size+=queue.poll().length();

           //     System.out.println("after release");
       // }}
}}



public void s(){
    System.out.println(size);

}

    public Long getSize() {
        return size;
    }
}
