package com.fly.learn.algorithm.sort;

import java.util.Arrays;

/**
 * @Description 选择排序
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/10/15 20:21
 */
public class SelectSort {


    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 6, 3};
        sort(arr);
    }


    public static void sort(int[] arr) {

        int currentIndex = 0;
        int tempValue;
        int tempIndex = 0;

        while (currentIndex < arr.length) {
            tempValue = arr[currentIndex];

            for(int i=currentIndex + 1; i<arr.length; i++) {
                if(arr[i] < tempValue) {
                    tempValue = arr[i];
                    tempIndex = i;
                }
            }
            if(tempValue < arr[currentIndex]) {
                arr[tempIndex] = arr[currentIndex];
                arr[currentIndex] = tempValue;
            }
            // 重置当前指针
            currentIndex++;
            // 重置当前临时用来比较的变量（很容易忘记这一句）
//            tempValue = arr[currentIndex];
            System.out.println("第" + (currentIndex + 1) + "轮比较结果 = " + Arrays.toString(arr));
        }


    }


}





