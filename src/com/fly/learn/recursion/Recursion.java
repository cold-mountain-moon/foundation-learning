package com.fly.learn.recursion;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/8/16 14:04
 */
public class Recursion {
    static List<Map<String, Object>> list = new ArrayList<>();
    static List<Map<String, Object>> result = new ArrayList<>();

    static {


        Map<String, Object> map1 = new LinkedHashMap<>();
        map1.put("line", 1);
        map1.put("groupId", 1);
        map1.put("level", 1);
        Map<String, Object> map2 = new LinkedHashMap<>();
        map2.put("line", 2);
        map2.put("groupId", 1);
        map2.put("level", 2);

        Map<String, Object> map3 = new LinkedHashMap<>();
        map3.put("line", 3);
        map3.put("groupId", 1);
        map3.put("level", 3);

        Map<String, Object> map4 = new LinkedHashMap<>();
        map4.put("line", 4);
        map4.put("groupId", 1);
        map4.put("level", 1);

        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);



    }

    static int setChildren(Map<String, Object> currentMap, int nextIndex, List<Map<String, Object>> list) {
        List<Map<String, Object>> chilren = new ArrayList<>();

        Integer level = (Integer)currentMap.get("level");
        for(int i = nextIndex; i<list.size(); i++) {
            Map<String, Object> nextMap = list.get(i);
            Integer nextLevel = (Integer) nextMap.get("level");
            if(nextLevel - level == 1) {
                chilren.add(nextMap);
                setChildren(nextMap, i + 1, list);
            } else {
                currentMap.put("children", chilren);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = 0;
        for(int i = 0; i<list.size(); i++) {

            Map<String, Object> map = list.get(i);
            int nextIndex = setChildren(map, i+1, list);
            if(nextIndex == -1) {
                result.add(map);
            } else {
                i = nextIndex;
            }

        }
        System.out.println(result);

//        System.out.println();

    }













}
