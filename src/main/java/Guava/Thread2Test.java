package Guava;

/**
 * @program: Builder.test
 * @description: 通过lambda实现多线程
 * @author: yuhang
 * @create: 2019-07-19 21:15
 **/
public class Thread2Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1、执行任务1");
        Thread A = new Thread(() -> {
            int temp = 0;
            for (int i = 0; i < 20; i++) {
                temp += i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我是线程:" + Thread.currentThread().getName());
            }
        }, "A");
        Thread B = new Thread(() -> {
            int temp = 0;
            for (int i = 0; i < 20; i++) {
                temp += i;
                System.out.println("我是线程:" + Thread.currentThread().getName());
            }
        }, "B");
        A.start();
        B.start();

        System.out.println("1、执行任务N");

    }

}
