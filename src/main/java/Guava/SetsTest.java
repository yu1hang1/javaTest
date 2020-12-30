package Guava;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * @program: Builder.test
 * @description:
 * sets 练习
 * @author: yuhang
 * @create: 2019-07-18 16:59
 **/
public class SetsTest {
    public static void main(String[] args) {
        Set setA = Sets.newHashSet(1,2,3,4,5);
        Set setB = Sets.newHashSet(4,5,6,7,8);
        System.out.println(Sets.union(setA,setB));//集合AB的并集
        System.out.println(Sets.intersection(setA,setB));//集合AB的交集
        System.out.println(Sets.difference(setA,setB));//集合A中去除B的元素
        System.out.println(Sets.symmetricDifference(setA,setB));//集合AB并—集合AB交

    }

}
