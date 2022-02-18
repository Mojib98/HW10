package Tamrin6;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("Start");
        Work work1=new Work();
        Work work2 = new Work();
        work1.start();
        work2.start();
       // Work works[] = new Work[10];
        // for (int i=0; i<works.length; i++) {
         //   works[i] = new Work(); // create thread
           // works[i].start();
       // }
        System.out.println("End of Main thread");
    }
    }

