package ObserverPattern;

/**
 * @program: Builder.test
 * @description:
 * 1、Observer观察者实体，即实际观测在这里面实现，该类接受一个被观测对象subject，并将自己添加到观察者list中
 * 2、当收受到观察者通知时，实际的响应在这里面实现
 * 3、该观察者在本程序中是将被观测对象的Integer变量转为二进制
 * @author: yuhang
 * @create: 2019-07-30 17:38
 **/

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}