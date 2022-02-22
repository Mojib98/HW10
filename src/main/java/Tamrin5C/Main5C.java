package Tamrin5C;

public class Main5C {
    public static void main(String[] args) {
        String s1="lock1";
        String s2="lock2";
        Thread n = new Thread(){
         public void run() {
             while (true) {
                 synchronized (s1) {
                     System.out.println(Thread.currentThread().getName() + "lock: " + s1);
                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }

                     synchronized (s2) {
                         System.out.println(Thread.currentThread().getName() + "Lock: " + s2);
                         try {
                             Thread.sleep(100);
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
         } };
        Thread s = new Thread(){
            public void run() {
                while (true) {
                    synchronized (s2) {
                        System.out.println(Thread.currentThread().getName() + "lock: " + s2);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        synchronized (s1) {
                            System.out.println(Thread.currentThread().getName() + "Lock: " + s1);
                            System.out.println(s1 + " " + s2);
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }};
        n.start();
        s.start();
    }
}
