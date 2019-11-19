package com.fly.learn.algorithm.others;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/11/13 18:35
 */
public class Date {


    public static List<String> getDesc() {
        List<String> result = new ArrayList<>();

        int[] arr = {2, 3, 5, 7};
        int start = 0;
        int end = 0;

        int currentIndex = 1;
        for(int i=currentIndex; i<arr.length; i++) {
            if(arr[i] - arr[end] == 1) {
                end = i;
                continue;
            }
            if(arr[i] - arr[end] > 1) {
                if(end > start) {
                    result.add(arr[start] + "-" + arr[end]);

                } else {
                    result.add(arr[start] + "");
                }
                end = i;
                start = i;
                currentIndex = i;
            }
        }

        System.out.println(result);

        return null;
    }

    public static void main(String[] args) {
        getDesc();
    }

}
