package DesignPatterns.Singleton;

/**
 * @program: test
 * @description:
 * 【单例设计模式】
 * 1、目的：实例化一个类时，只允许创建一个对象
 * 2、应用场景：系统初始化数据，不管调用几次只需创建一次即可，过多创建浪费内存空间
 * 3、实现方式：在创建类的时候通过私有化构造方法来进行限制外部创建对象，而对象通过类的内部创建
 * 懒汉式：先声明一个instance，然后通过判断是否为空（初始值肯定为空），如果为空才创建
 * 恶汉式：类内部创建对象，通过final关键字进行修饰
 * @author: yuhang
 * @create: 2019-09-02 17:11
 **/
class SingletonDemo {
    public static void main(String[] args) {
        //声明对象
        SingletonA instanceA = null;
        //调类中方法创建一个对象
        instanceA = SingletonA.getInstance();
        instanceA.print();

        SingletonB instanceB = null;
        //调类中方法创建一个对象
        instanceB = SingletonB.getInstance();
        instanceB.print();

    }
}
