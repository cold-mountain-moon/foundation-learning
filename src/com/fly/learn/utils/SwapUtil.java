package com.fly.learn.utils;

/**
 * @Description TODO
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/9/29 17:45
 */
public class SwapUtil {


    /**
     * 交换数组的两个元素
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 不使用中间变量交换数组的两个元素
     * @param arr
     * @param i
     * @param j
     */
    public static void swap2(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        swap2(arr1, 0, 2);
        for(Object obj : arr1) {
            System.out.println(obj);
        }
    }


}
