package ObserverPattern;

/**
 * @program: Builder.test
 * @description:
 * 1、也为一个观察者实体
 * 2、该观察者在本程序中是将被观测对象的Integer变量转为八进制
 * @author: yuhang
 * @create: 2019-07-30 17:38
 **/
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}