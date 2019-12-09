package com.fly.learn.algorithm.sort;

import java.util.Arrays;

/**
 * @Description 基数排序
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/10/16 18:17
 */
public class RadixSort {



    public static void main(String[] args) {
        int[] arr = {24, 16, 5515, 12, 123, 11, 255, 5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }



    public static void sort(int[] arr) {
        int len = arr.length;
        int bucketCount = 10;
        // 构造桶
        Integer[][] bucket = new Integer[bucketCount][len];
        int count = getLoopCount(arr, len);
        // 记录每个桶中的当前元素个数
        int[] bucketLengths = new int[bucketCount];
        int bit = 1;
        for(int i=0; i<count; i++) {
            for(int j = 0; j < len; j++) {
                int m = arr[j] / bit % 10;
                bucket[m][bucketLengths[m]] = arr[j];
                bucketLengths[m] = bucketLengths[m] + 1;
            }
            bit *= 10;

            int index = 0;
            for(int j = 0; j < len; j++) {
                Integer[] thisBucket = bucket[j];
                int thisBucketLen = bucketLengths[j];
                for(int k = 0; k < thisBucketLen; k++) {
                    arr[index] = thisBucket[k];
                    index++;
                    // 清空桶中的元素
                    bucket[j][k] = null;
                }

            }
            // 每次排序后清空桶的当前元素个数
            for(int j = 0; j < len; j++) {
                bucketLengths[j] = 0;
            }
        }








    }

    private static int getLoopCount(int[] arr, int len) {
        int a0 = arr[0];
        for(int i=1; i<len; i++) {
            a0 = arr[i] > a0 ? arr[i] : a0;
        }
        int count = String.valueOf(a0).length();
        return count;
    }


}



















