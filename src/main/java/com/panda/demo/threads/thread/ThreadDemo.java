package com.panda.demo.threads.thread;

import java.lang.Thread;

public class ThreadDemo extends Thread {

    private int i = 0;

    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
        }
    }

}
