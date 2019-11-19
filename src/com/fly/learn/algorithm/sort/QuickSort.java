package com.fly.learn.algorithm.sort;

import com.fly.learn.utils.SwapUtil;

import java.util.Arrays;

/**
 * @Description 快速排序
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/10/16 18:18
 */
public class QuickSort {


    public static void main(String[] args) {
        
        int[] arr = {3, 2, 6, 8, 1, 4, 5, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
//        int [] arr1 = new int[8000000];
//        for(int i=0; i<8000000; i++) {
//            arr1[i] = (int)(Math.random() * 80000);
//        }
////        System.out.println(Arrays.toString(arr1));
//        long l = System.currentTimeMillis();
//        sort(arr1);
//        long l1 = System.currentTimeMillis();
////        System.out.println(Arrays.toString(arr1));
//        System.out.println(l1 - l);
    }

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);


    }


    private static void quickSort(int[] arr, int left, int right) {

        if(left < right) {
            int partition = partition2(arr, left, right);
            quickSort(arr, left, partition - 1);
            quickSort(arr, partition + 1, right);
        }
    }

    /**
     * 分成两块：寻找基准值的位置
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private static int partition(int[] arr, int left, int right) {
//        System.out.println("结果：" + Arrays.toString(arr));
        int pivot = left;
        int index = pivot + 1;
        for(int i=index; i<=right; i++) {
            if(arr[i] < arr[pivot]) {
                SwapUtil.swap(arr, i, index);
                index++;
            }
        }
        SwapUtil.swap(arr, pivot, index-1);
        return index - 1;
    }

    /**
     * 用两个哨兵的方式分别从后往前寻找基准值的正确位置
     *
     * {3, 2, 6, 8, 1, 4, 5, 7}
     * @return
     */
    private static int partition2(int[] arr, int left, int right) {

        int pivot = arr[left];

        while(left < right) {
            while(arr[right] >= pivot && left < right) {
                right--;
            }
            arr[left] = arr[right];
            while(arr[left] < pivot && left < right) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }











}
