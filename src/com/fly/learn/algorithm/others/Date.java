package com.fly.learn.algorithm.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

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

        int[] week = {1, 2, 3, 4, 5, 6, 7};
        int[] arr = {2, 3, 5, 7};
        int[] realWeek = new int[week.length];
        for(int i=0, len=arr.length; i<len; i++) {
            realWeek[arr[i] - 1] = arr[i];
        }
        String arrStr = "";
        for (int i = 0; i < realWeek.length; i++) {
            arrStr += realWeek[i];
        }

        String[] split = arrStr.split("0");
        for(int i=0; i<split.length; i++) {
            String s = split[i];
            if("".equals(s)) {
                continue;
            }
            if(s.length() == 1) {
                result.add(split[i]);
            } else {
                result.add(s.substring(0, 1) + "至" + s.substring(s.length() - 1));
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        getDesc();
    }

}
