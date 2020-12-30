package ObserverPattern;

/**
 * @program: Builder.test
 * @description:
 *              【测试用例】
 * =========================================
 *          观察者 & 订阅发布者区别
 * 1、观察者只有一个subject，订阅发布者可有多个subject
 * 2、即观察者维护的是单一subject（事件）与 多个依赖该事件对象的关系，订阅发布者维护的是多个subject（事件）与 依赖于
 * 各个subject的关系
 * 3、订阅发布者 比 观察者 更加灵活多变
 * =========================================
 * @author: yuhang
 * @create: 2019-07-30 17:40
 **/
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
