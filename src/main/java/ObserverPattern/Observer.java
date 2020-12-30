package ObserverPattern;

/**
 * @program: Builder.test
 * @description:
 * 1、Observer为观察者抽象类，当subject状态发生变化时，可以用多个观察者做出不同响应
 * 2、所以将其设置成为基类，让其不同的观察者实体去继承
 * 3、在该类里实例化一个subject对象，在实体类中用于接收实际的subject，当subject状态发生改变，会通知给所有观察者
 * @author: yuhang
 * @create: 2019-07-30 17:36
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}