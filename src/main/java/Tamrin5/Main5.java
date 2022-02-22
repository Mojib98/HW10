package Tamrin5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main5 {
    public static void main(String[] args) {
        ReentrantLock reentrantLock1 = new ReentrantLock();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        TreadA treadA = new TreadA(reentrantLock1,reentrantLock2);
        TreadB treadB = new TreadB(reentrantLock1,reentrantLock2);
        treadA.start();
        treadB.start();
    }
}
