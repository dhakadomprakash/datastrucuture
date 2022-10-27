package com.ds.test;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
    ReentrantLock l = new ReentrantLock(true);

    public void wish(String name) {
        l.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("good afternoon " + name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        l.unlock();
    }
}
