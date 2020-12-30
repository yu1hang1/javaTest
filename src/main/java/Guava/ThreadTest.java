package Guava;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @program: Builder.test
 * @description: 多线程的使用练习
 * 1、实现多线程有两种方式，一种是继承thread类，重写让run方法，另一种是实现runnable接口，我们优先选择第二种
 * 2、原因是如果选择继承thread类具有单继承局限，有弊端
 * 3、不论使用哪种方式，开启一个多线程调用的都是start()方法，可以让线程变为准备执行状态。等待操作系统调度
 * @author: yuhang
 * @create: 2019-07-18 22:19
 **/
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        List list = Lists.newArrayList(1,3,4,5,6);

        Thread threadA = new Thread(new Mythread("线程对象A"));
        Thread threadB = new Thread(new Mythread("线程对象B"));
        threadA.sleep(1000);


        Thread threadC = new Thread(new Mythread("线程对象C"));
        threadA.start();
        threadB.start();
        threadC.start();
    }

}

class Mythread implements Runnable {
    private String title;
    //构造方法
    public Mythread(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(this.title + "运行，x=" + i);

        }
    }
}