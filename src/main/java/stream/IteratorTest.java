package stream;

import com.google.common.collect.Sets;

import java.util.Iterator;
import java.util.Set;

/**
 * @program: Builder.test
 * @description:
 * iterator是collection的一个方法，它是Iterator类型的接口，可将集合转转换一个可迭代对象
 * Iterator是一个接口，里面主要方法有：hasnext()、next()
 * @author: yuhang
 * @create: 2019-07-22 16:55
 **/
public class IteratorTest {
    public static void main(String[] args) {
        Set<String> all = Sets.newHashSet("hello","world","love");
        Iterator<String> iter = all.iterator();
        while (iter.hasNext()){
            String str = iter.next();

            System.out.println(str);
        }
    }
}
