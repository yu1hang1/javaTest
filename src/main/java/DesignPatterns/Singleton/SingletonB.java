package DesignPatterns.Singleton;

/**
 * @program: test
 * @description:
 * 【懒汉式】
 * @author: yuhang
 * @create: 2019-09-02 18:12
 **/

public class SingletonB {
    //类中创建一个对象，用private封装起来
    private static SingletonB instance;

    //构造方法私有化
    private SingletonB() {
    }
    //公有方法取私有属性
    public static SingletonB getInstance() {
        if (instance == null) {//第一次使用
            instance = new SingletonB();//实例化对象
        }
        return instance;
    }
    //类要做的事情
    public void print() {
        System.out.println("我是一个懒汉单例");
    }
}