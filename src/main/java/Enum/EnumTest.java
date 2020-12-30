package Enum;

/**
 * @program: test
 * @description:
 * 枚举 & 多例 设计模式
 * 1、枚举对象要写在第一行
 * 2、实例要用大写字母
 *
 * @author: yuhang
 * @create: 2019-09-02 16:09
 **/



public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Sex.MALE);

        System.out.println(Sex.Female.getCode());
        System.out.println(Sex.MALE.getDisplayName());
        System.out.println(Sex.getDisplayName(2));

        Person person = new Person("zhang",22,Sex.MALE);
        System.out.println(person);
    }

}
