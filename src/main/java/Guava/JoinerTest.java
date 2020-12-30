package Guava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @program: Builder.test
 * @description:
 * guava 在String中的应用
 * @author: yuhang
 * @create: 2019-07-18 16:20
 **/
public class JoinerTest {
    public static void main(String[] args) {
        testJoiner1();
        testSplit();

    }

    /**
     * -------列表转字符串---------
     * 1、Joiner.on(分隔符)+join(被连接的列表)
     * 2、skipNulls()方法可以跳过null
     * 3、useForNull("x")使用字符替换null*/
    private static void testJoiner1(){
        System.out.println(Joiner.on("-").skipNulls().join(Lists.newArrayList("a","",null,"b")));
        System.out.println(Joiner.on("-").useForNull("x").join(Lists.newArrayList("a","",null,"b")));
     }
     /**
      * -----字符串转列表---------
      * 1、使用split，接受参数为分隔符
      * 2、splitter是guava为我们提供的，使用之前应该下new一个对象*/
     private static void testSplit(){
        String s = "a-s-d - ";
         Splitter splitter = Splitter.on("-").trimResults().omitEmptyStrings();
         List list = splitter.splitToList(s);
         System.out.println(list);
     }
}
