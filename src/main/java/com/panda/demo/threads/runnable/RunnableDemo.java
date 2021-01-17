package com.panda.demo.threads.runnable;

import java.lang.Runnable;

public class RunnableDemo implements Runnable {

    private int i = 0;

    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
        }
    }
}
