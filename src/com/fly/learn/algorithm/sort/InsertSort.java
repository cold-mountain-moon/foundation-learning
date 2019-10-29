package com.fly.learn.algorithm.sort;

import java.util.Arrays;

/**
 * @Description 插入排序
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/10/15 21:31
 */
public class InsertSort {

    static final int MAX = 80000;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
        for(int i=0; i<MAX; i++) {
            arr[i] = (int) (Math.random() * MAX);
        }

        long start = System.currentTimeMillis();
        sort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

//        int[] arr = {3, 5, 1, 4, 2, 6};
//        sort(arr);
//        System.out.println();
    }

    public static void sort(int[] arr) {
        int currentIndex = 0;
        int insertIndex = 0;

        int temp = 0;
        for(int i=1; i<arr.length; i++) {
            insertIndex = i - 1;
            currentIndex = i;
            while (insertIndex >= 0 && arr[currentIndex] < arr[insertIndex]) {

                temp = arr[currentIndex];
                arr[currentIndex] = arr[insertIndex];
                arr[insertIndex] = temp;

                insertIndex--;
                currentIndex--;
            }

//            System.out.println("第" + i + "次结果：" + Arrays.toString(arr));
        }

    }







}





















