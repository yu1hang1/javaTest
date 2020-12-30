package ObserverPattern;

/**
 * @program: Builder.test
 * @description:
 * 1、Subject是被观察对象，它里面存储着被观测的数据
 * 2、它作为观察者的接收对象，可以供多个观察者观测，多个观察者用一个list保存
 * 3、该对象里面有一个notify通知方法，当Subject状态发生改变时（如增加或修改一个变量），自动通知给观察者list所有成员
 * 4、观察则成员受到通知后，会做出响应的update
 * @author: yuhang
 * @create: 2019-07-30 17:35
 **/
import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}