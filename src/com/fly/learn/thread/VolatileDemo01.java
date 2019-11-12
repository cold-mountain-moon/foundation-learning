package com.fly.learn.thread;

import java.util.concurrent.TimeUnit;

public class VolatileDemo01 {

    static boolean stop = true;


    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            int i = 0;
            while(stop) {
                i++;
            }
        });
        t.start();


        TimeUnit.SECONDS.sleep(1L);
        stop = false;


    }


}
