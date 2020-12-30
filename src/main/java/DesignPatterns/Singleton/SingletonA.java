package DesignPatterns.Singleton;

/**
 * @program: test
 * @description:
 * 【饿汉式】
 * @author: yuhang
 * @create: 2019-09-02 17:11
 **/


public class SingletonA {
    //类中创建一个对象，用private封装起来
    private static final SingletonA instance = new SingletonA();

    //构造方法私有化
    private SingletonA() {
    }

    //公有方法取私有属性
    public static SingletonA getInstance() {
        return instance;
    }

    //类要做的事情
    public void print() {
        System.out.println("我是一个恶汉单例");
    }
}
