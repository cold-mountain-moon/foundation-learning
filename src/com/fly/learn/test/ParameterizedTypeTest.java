package com.fly.learn.test;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Company 北京岚时科技
 * @Version v1.0
 * @Author liheng
 * @Date 2019/11/16 19:08
 */
public class ParameterizedTypeTest {


//    public static void main(String[] args) {
//
//        List<A> list = new ArrayList<>();
//        ParameterizedType genericSuperclass = (Class<T>)((ParameterizedType) list.getClass().getGenericSuperclass());
//        Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
//        System.out.println(actualTypeArguments[0]);
//
//
//
//
//    }

    private List<Character> list;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Field listField = ParameterizedTypeTest.class.getDeclaredField("list");
            //获取 list 字段的泛型参数
            ParameterizedType listGenericType = (ParameterizedType) listField.getGenericType();
            Type[] listActualTypeArguments = listGenericType.getActualTypeArguments();
            System.out.println(listActualTypeArguments[listActualTypeArguments.length - 1]);
            for (int i = 0; i < listActualTypeArguments.length; i++) {
                System.out.println(listActualTypeArguments[i].getTypeName());
            }
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
