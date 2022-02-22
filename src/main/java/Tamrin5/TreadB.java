package Tamrin5;

import java.util.concurrent.locks.ReentrantLock;

public class TreadB extends Thread{
    ReentrantLock reentrantLock1;
    ReentrantLock reentrantLock2;

    public TreadB(ReentrantLock reentrantLock1, ReentrantLock reentrantLock2) {
        this.reentrantLock1 = reentrantLock1;
        this.reentrantLock2 = reentrantLock2;
    }

    @Override
    public void run() {
        reentrantLock2.lock();
        //D
        for (int i = 0;i<0;i++){
            System.out.println(i);
        }
        if (!reentrantLock1.isLocked()){
            reentrantLock2.unlock();
        }

    }
}
