package com.fly.learn.thread;

/**
 * @Description volatile关键字
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/8/8 22:15
 */
public class Thread02 {

//    private static boolean ready;
    private volatile static boolean ready;

    private static int number;

    static class ReaderTread extends Thread {

        @Override
        public void run() {
            while(!ready) {} ;
            System.out.println(number);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        new ReaderTread().start();
        Thread.sleep(2000);

        ready = true;
        number = 50;

        Thread.sleep(2000);
    }

}
