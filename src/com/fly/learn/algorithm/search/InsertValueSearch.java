package com.fly.learn.algorithm.search;

/**
 * @Description 插值查找：基于二分查找，只是将mid的值进行了优化，在数据分布比较均匀是效率较高
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/10/29 19:44
 */
public class InsertValueSearch {


    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 9, 6, 7, 8};
        int index = search(arr, 6);
        System.out.println("索引未：" + index);
    }


    public static int search(int[] arr, int value) {
        int high = arr.length - 1;
        int low = 0;
        int mid = 0;
        if(value < arr[0] || value > high || low > high) {
            return -1;
        }
        int count = 0;
        while (low <= high) {
            System.out.println(++count);
            mid = low + (high - low) * (value - arr[low]) / (arr[high] - arr[low]);
            System.out.println("mid = " + mid);
            if(value == arr[mid]) {
                return mid;
            }
            if(value < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;



    }

}
