package com.fly.learn.algorithm.sort;

/**
 * @Description 归并排序
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/10/9 19:20
 */
public class MergeSort {


    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 5, 1, 6};
        mergeSort(arr, 0, arr.length - 1);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void mergeSort(int[] arr, int left, int end) {
        mergeSort(arr, left, end, new int[arr.length]);
    }

    private static void mergeSort(int[] arr, int left, int end, int[] temp) {
        if(left >= end) {
            return;
        }
        int mid = left + (end - left) / 2;
        mergeSort(arr, 0, mid, temp);
        mergeSort(arr, mid + 1, end, temp);
        merge(arr, left, mid, end, temp);

    }



    // arr = [3, 2, 5, 9, 0]
    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {

        int i = left;
        int j = mid + 1;
        int tempIndex = 0;

        while(i <= mid && j <= right) {
            if(arr[i] > arr[j]) {
                temp[tempIndex++] = arr[j++];
            } else {
                temp[tempIndex++] = arr[i++];
            }
        }
        while(i <= mid) {
            temp[tempIndex++] = arr[i++];
        }
        while(j <= right) {
            temp[tempIndex++] = arr[j++];
        }
        for(int k=0; k<tempIndex; k++) {
            arr[left + k] = temp[k];
        }
        
    }


}
