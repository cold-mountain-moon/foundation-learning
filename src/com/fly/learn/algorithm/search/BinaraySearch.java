package com.fly.learn.algorithm.search;

/**
 * @Description 二分查找
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/10/28 17:54
 */
public class BinaraySearch {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index = search(arr, 6, 0, arr.length - 1);
//        int index = searchWhile(arr, 6);
        System.out.println(index);
    }

    /**
     * 递归二分查找
     * @param arr 排过序的数组
     * @param value 目标值
     * @param start 递归的起始索引
     * @param end 递归的结束索引
     * @return 下表，如果没找到，返回-1
     */
    public static int search(int[] arr, int value, int start, int end) {
        int temp = (start + end) / 2;

        if(start < end) {
            if(value == arr[temp]) {
                return temp;
            }
            if(value < arr[temp]) {
                return search(arr, value, start, temp - 1);
            }
            if(value > arr[temp]) {
                return search(arr, value, temp + 1, end);
            }
        }

        return -1;
    }

    /**
     * 使用循环方式二分查找
     * @param arr
     * @param value
     * @return
     */
    public static int searchWhile(int[] arr, int value) {
        int high = arr.length - 1;
        int low = 0;
        int count = 0;

        if(value > arr[high] || value < arr[low] || low > high) {
            return -1;
        }
        while (low <= high) {
//            System.out.println(++count);
            int mid = (low + high) / 2;
            if(arr[mid] == value) {
                return mid;
            }
            if(arr[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }




}
