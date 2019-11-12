package com.fly.learn.algorithm.sort;

import com.fly.learn.utils.SwapUtil;

import java.util.Arrays;

/**
 * @Description 冒泡排序
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/9/29 17:42
 */
public class BubbleSort {


    public static void main(String[] args) {
//        int[] arr = {2, 0, 8, 1, 4, 6, 5};
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.sort(arr);
//
//        print(arr);

        int [] arr1 = new int[80000];
        for(int i=0; i<80000; i++) {
            arr1[i] = (int)(Math.random() * 80000);
        }
//        System.out.println(Arrays.toString(arr1));
        long l = System.currentTimeMillis();
        sort(arr1);
        long l1 = System.currentTimeMillis();
//        System.out.println(Arrays.toString(arr1));
        System.out.println(l1 - l);
    }


    /**
     * 排序
     * @param arr
     */
    public static void sort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    SwapUtil.swap2(arr, j, j + 1);
                }
            }
        }
    }


    private static void print(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



































}
