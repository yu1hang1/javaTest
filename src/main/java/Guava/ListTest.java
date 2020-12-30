package Guava;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @program: Builder.test
 * @description:
 * guava 对List 提供的方法
 * @author: yuhang
 * @create: 2019-07-18 17:00
 **/
public class ListTest {
    public static void main(String[] args) {
        listTest();

    }
    public  static void listTest(){
        List list = Lists.newArrayList(1,1,3,41,23,12,31,3);

        System.out.println(list);
        // reverse 反转，将一个列表逆序输出
        System.out.println(Lists.reverse(list));

    }
}
