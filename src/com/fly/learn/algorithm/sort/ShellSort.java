package com.fly.learn.algorithm.sort;

import java.util.Arrays;

/**
 * @Description 希尔排序
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/10/16 18:16
 */
public class ShellSort {


    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 1, 2, 5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }



    /**
     *
     *
     *
     *  |--------|
     *  |  |========|
     *  |  |  |........|
     *  |  |  |  |  |  |
     *  3, 4, 6, 2, 1, 5
     */

    public static void sort(int[] arr) {
        int len = arr.length;
        for(int gap = len / 2; gap > 0; gap /= 2) {
            for(int i = gap; i < len; i++) {
                int curValue = arr[i];
                int j = i - gap;
                while (j >= 0 && arr[j] > arr[i]) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = curValue;
            }
        }
    }
























}
