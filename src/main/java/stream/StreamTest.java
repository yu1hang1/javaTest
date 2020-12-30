package stream;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;


import javax.sound.midi.Track;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: Builder.test
 * @description: 1、Stream 是用函数式编程方式在集合类上进行复杂操作的工具
 * 2、返回的 Stream 对象却不是一个新集合，而是创建新集合的配方
 * 3、使用for原理也是Iterator操作，详见IteratorTest
 * 4、而Steam相当于帮我们把迭代过程封装，所以相当于内部迭代
 * @author: yuhang
 * @create: 2019-07-18 11:25
 **/
public class StreamTest {


    public static void main(String[] args) {
        String[] strarr = {"abc", "defg", "vwxyz"};int iSum = Arrays.stream(strarr)
                .mapToInt(s -> s.length())
                .sum();
        System.out.println("长度和: "+iSum);
    }


    /**
     * 1、这行代码并未做什么实际性的工作，filter 只刻画出了 Stream，但没有产生新的集合。
     * 2、像 filter 这样只描述 Stream，最终不产生新集合的方法叫作惰性求值方法;
     * 而像 count 这样 最终会从 Stream 产生值的方法叫作及早求值方法。
     * 3、判断一个操作是惰性求值还是及早求值很简单:只需看它的返回值。如果返回值是 Stream， 那么是惰性求值;
     * 如果返回值是另一个值或为空，那么就是及早求值。
     */
    public static void StreamTest() {
        List list = Lists.newArrayList(1, 2, "2");
        System.out.println(list.stream().filter(ele -> ele.equals(2)));
    }

    /**
     * 这段程序展示了如何使用 collect(toList()) 方法从 Stream 中生成一个列表。
     * 由于很多 Stream 操作都是惰性求值，
     * 因此调用 Stream 上一系列方法之后，还需要最后再 调用一个类似 collect 的及早求值方法。
     */
    public static void collectTest2() {
        List list1 = Stream.of(1, 3, 4, 5).collect(Collectors.toList());
        System.out.println(list1);
    }

    /**
     * 如果有一个函数可以将一种类型的值转换成另外一种类型，map 操作就可以
     * 使用该函数，将一个流中的值转换成一个新的流
     * 使用 map 操作将字符串转换为大写形式,即对单个元素进行操作
     */
    public static void mapTest3() {
        List<String> list = (List<String>) Lists.newArrayList("a","b","C");
        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));

    }

    /**
     * filter接受一个函数作为参数，该函数用Lambda表达式表示。该函数和 if 条件判断语句的功能一样
     * 经过过滤， Stream 中符合条件的，即 Lambda 表达式值为 true 的元素被保留下来。
     * 该 Lambda 表达式 的函数接口正是 Predicate
     */
    public static void filterTest4() {
        List<String> list = (List<String>) Lists.newArrayList("a", "1abc", "abc1");
        System.out.println(list.stream().filter(ele -> ele.endsWith("c")).collect(Collectors.toList()));
    }

    /**
     * flatMap 方法可用 Stream 替换值，然后将多个 Stream 连接成一个 Stream
     * 前面已介绍过 map 操作，它可用一个新的值代替 Stream 中的值。但有时，用户希望让 map 操作有点变化，
     * 生成一个新的 Stream 对象取而代之。
     * 用户通常不希望结果是一连串的流， 此时 flatMap 最能派上用场
     */
    public static void flatMapTest5() {
        List<String> listA = (List<String>) Lists.newArrayList("a", "1abc", "abc1");
        List<String> listB = (List<String>) Lists.newArrayList("b", "2abc", "2abc1");
        System.out.println(Stream.of(listA, listB).flatMap(ele -> ele.stream()).collect(Collectors.toList()));
    }

    /**
     * 1、Stream 上常用的操作之一是求最大值和最小值。Stream API 中的 max 和 min 操作足以解决 这一问题。
     * 2、为了让Stream对象按照曲目长度进行排序，需要传给它一个Comparator对象
     */
    public static void MaxAndMinTest() {

    }

    /**
     * 1、reduce 操作可以实现从一组值中生成一个值。
     * 2、Lambda 表达式的返回值是最新的 acc，是上一轮 acc 的值和当前元素相加的结果
     */
    public static void reduceTest() {
        List<Integer> list = (List<Integer>) Lists.newArrayList(1, 2, 3);
        System.out.println(list.stream().reduce(10, (acc, ele) -> (acc + ele)));
    }

    /**
     * 1、distinct()的作用是去重
     */
    public static void distinct() {
        List<String> list = (List<String>) Lists.newArrayList("a", "a", "1abc", "abc1");
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
    }

    /**
     * 1、给一组数字排序
     */
    public static void sortedTest() {
        List<Integer> list = (List<Integer>) Lists.newArrayList(1, 2, 213, 123, 12);
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
    }

    /**
     * 中间操作
     * 指的是在流期间，可对单个元素进行操作。带着上一步流的结果去执行
     * 只迭代一次，所以是惰性求值
     */
    public static void peekTest() {
        List list = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     * 1、它和filter功能类似，都是用来匹配/过滤符合条件的元素
     * 2、区别是anyMatch返回的是一个Boolean类型，filter返回的是一个Stream类型
     * 3、和短路操作的联系？
     */
    public static void anymatchTest() {
        Boolean is = Stream.of("aa", "ab", "").anyMatch(e -> e.endsWith("b"));
        System.out.println(is);
    }


    public static int StreamHomeWrokA(Stream<Integer> numbers) {
        return numbers.reduce(0, (acc, ele) -> acc + ele);
    }





}
