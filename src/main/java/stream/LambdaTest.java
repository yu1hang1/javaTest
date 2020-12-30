package stream;

import Guava.ListTest;

/**
 * @program: Builder.test
 * @description:
 * lambda 函数式编程练习
 * @author: yuhang
 * @create: 2019-07-22 15:01
 **/
@FunctionalInterface
interface IFunction<P,R>{
    public R change(P p);

}
public  class LambdaTest {
    public  static void main(String[] args) {
        ListTest listTest = new ListTest();
     String  s= "1";
        //给valueOf 加一个引用
        IFunction<Integer,String> fun = String::valueOf;

        String str = fun.change(100);
        System.out.println(str.length());

    }
}
