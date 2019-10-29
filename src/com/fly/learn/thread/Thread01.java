package com.fly.learn.thread;

import sun.java2d.loops.GraphicsPrimitive;

/**
 * @Description TODO
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/8/8 21:55
 */
public class Thread01 {

    public volatile static int j = 0;

    static class AddThread extends Thread {

        @Override
        public void run() {
            for(int i=0; i<10000000; i++) {
                j++;

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AddThread addThread = new AddThread();
        addThread.start();
        addThread.join();

        System.out.println(j);
    }


}
