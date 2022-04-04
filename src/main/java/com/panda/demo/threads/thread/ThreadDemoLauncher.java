package com.panda.demo.threads.thread;

public class ThreadDemoLauncher {

    public static void main(String[] args) {
        ThreadDemo threadDemo_1 = new ThreadDemo();
        threadDemo_1.start();
        ThreadDemo threadDemo_2 = new ThreadDemo();
        threadDemo_2.start();
    }

}
