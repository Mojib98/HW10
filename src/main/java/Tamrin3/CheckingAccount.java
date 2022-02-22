package Tamrin3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class CheckingAccount {
    private int balance;
    public CheckingAccount(int initialBalance) {
        balance = initialBalance;
    }
    public boolean withdraw(int amount) {
        if (amount < balance) {
            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (InterruptedException ie) {
            }
            balance -= amount;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        final CheckingAccount ca = new CheckingAccount(100);
        Runnable r = new Runnable() {
            @Override
            public void run() {


                 //

                    for (int i = 0; i < 10; i++) {
                        String name = Thread.currentThread().getName();
                        synchronized (name) {
                     //  reentrantLock.lock();

                        System.out.println(name + " withdraws $10: " +
                                ca.withdraw(10) + " " + ca.balance + " " + i);

                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                  //
             }
               // reentrantLock.unlock();

                // }
            }};
        Thread thdHusband = new Thread(r);
        thdHusband.setName("Husband");
        Thread thdWife = new Thread(r);
        thdWife.setName("Wife");
        thdHusband.start();
        thdWife.start();
    }
}