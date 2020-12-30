package base;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: test
 * @description: Pair的使用及练习
 * pair and map 区别联系
 * 没啥联系，一个是哈希映射，通过key取值，一个是成对存储的数据结构
 * @author: yuhang
 * @create: 2019-09-02 12:33
 **/
public class pairTest {
    public static void main(String[] args) {
//        抽象类，创建匿名对象
        Pair<Integer, String> pair;
        pair = Pair.of(1, "xxxx");
        Boolean x = Boolean.TRUE;
        long times = 1586455201736L;
        Date time = new Date(times);
        System.out.println(time);

    }
}
