package Guava;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @program: Builder.test
 * @description:
 * 练习Maps工具 重点是difference
 * @author: yuhang
 * @create: 2019-07-18 17:00
 **/
public class MapsTest {
    public static void main(String[] args) {
        Map<Integer,Integer> a = Maps.newHashMap();
        a.put(1,2);
        a.put(3,4);

        Map<Integer,Integer> b = Maps.newHashMap();
        b.put(5,6);
        b.put(1,8);

        //输出a、b之外，会把同一个key放到一起输出
        System.out.println(Maps.difference(a,b));
        System.out.println();
    }
}
