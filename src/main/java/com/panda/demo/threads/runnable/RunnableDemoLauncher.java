package com.panda.demo.threads.runnable;

public class RunnableDemoLauncher {

    public static void main(String[] args) {
        RunnableDemo runnableDemo_1 = new RunnableDemo();
        RunnableDemo runnableDemo_2 = new RunnableDemo();
        new Thread(runnableDemo_1, "线程1").start();
        new Thread(runnableDemo_2, "线程2").start();
    }

}
