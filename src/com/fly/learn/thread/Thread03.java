package com.fly.learn.thread;

/**
 * @Description TODO
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/8/21 10:40
 */
public class Thread03 {




    public static void main(String[] args) throws InterruptedException {



        Thread charThread = new Thread(new Runnable() {
            int i = 'a';
            @Override
            public void run() {

                while (i <= 'z') {
                    System.out.println((char) i);

                    i++;
                }
            }
        });

        Thread numThread = new Thread(new Runnable() {
            int j = 1;

            @Override
            public void run() {
                while (j <= 26) {
                    System.out.println(j);
                    j++;
                }
            }
        });

        numThread.start();
        numThread.join();
        charThread.start();
        charThread.join();


        Object lock = new Object();
        new NumberThread(lock).start();
        new CharacterThread(lock).start();

    }
}

class NumberThread extends Thread {

    private Object lock;

    public NumberThread() {
        super();
    }

    public NumberThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        int i = 1;
        synchronized (lock) {
            while (i <= 26) {
                lock.notify();
                System.out.println(i);
                i++;
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }

    }

}

class CharacterThread extends Thread {

    private Object lock;

    public CharacterThread() {
        super();
    }

    public CharacterThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        int i = 'a';
        synchronized (lock) {
            while (i <= 'z') {
                lock.notify();
                System.out.println((char) i);
                i++;

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }

    }

}
