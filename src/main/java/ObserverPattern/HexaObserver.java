package ObserverPattern;

/**
 * @program: Builder.test
 * @description:
 * 1、也为一个观察者实体
 * 2、该观察者在本程序中是将被观测对象的Integer变量转为十六进制
 * @author: yuhang
 * @create: 2019-07-30 17:39
 **/
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}