package com.fly.learn.algorithm.recurrence;

/**
 * @Description 八皇后问题：递归回溯方法
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/9/28 13:01
 */
public class Queen8 {



    public static final int MAX = 9;

    /**
     * 用一维数组来表示皇后所处的位置，约定按行来摆放皇后，默认每个皇后处在不同的行，
     * 每次摆放都从新的一行起，所以可以用一维数组来表示
     * 数组下表表示第几个皇后， 所对应的值表示第几列
     * 如：array[0]=1, 表示第1个皇后放在第2列
     *    array[2]=5, 表示第3个皇后放在第6列
     */
    public static int[] array;

    public volatile int count = 0;

    public Queen8() {
        array = new int[MAX];
    }

    public static void main(String[] args) {
        Queen8 queen8 = new Queen8();
        long l = System.currentTimeMillis();
        queen8.setQueen(0);
        long end = System.currentTimeMillis();
        System.out.println(end - l);
    }


    public void setQueen(int n) {
        if(n >= MAX) {
            print();
            return;
        }
        for(int i=0; i<MAX; i++) {
            array[n] = i;
            if(noConflict(n)) {
                // 此处极其容易犯错误，写成++n, 应该写成n+1
                setQueen(n+1);

            }
        }
    }



    /**
     * 第n个皇后是否冲突
     * @param n 第n个皇后
     * @return
     */
    public boolean noConflict(int n) {

        for(int i = 0; i < n; i++) {
            if(Math.abs(array[i] - array[n]) == 0) {
                return false;
            }
            if(Math.abs(array[i] - array[n]) == Math.abs(i - n)) {
                return false;
            }
        }
        return true;
    }

    public void print() {
        for(int i = 0; i<MAX; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(++count);
    }


}
