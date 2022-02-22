package Tamrin5;

import java.util.concurrent.locks.ReentrantLock;

public class TreadA extends Thread{
    ReentrantLock reentrantLock1;
    ReentrantLock reentrantLock2;

    public TreadA(ReentrantLock reentrantLock1, ReentrantLock reentrantLock2) {
        this.reentrantLock1 = reentrantLock1;
        this.reentrantLock2 = reentrantLock2;
    }

    @Override
    public void run() {
        reentrantLock1.lock();
        //Do something
        for (int i = 0;i<0;i++)
            System.out.println(i);

        if (!reentrantLock2.isLocked()){
            reentrantLock1.unlock();
        }

    }
}
