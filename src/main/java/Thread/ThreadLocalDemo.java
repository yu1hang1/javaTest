package Thread;

/**
 * @program: test
 * @description: 1、Thread类可以解决资源引用传递时多线程安全问题，也就是线程的同步问题
 * 2、下面仍然采用对比的方式，看看如果使用多个Thread会出现什么问题。
 * 3、我们接下来完成一个发生消息的操作，定义两个类【消息实体Message】和【传送类channel】
 * 4、接下来使用多个Thread完成发送消息,会出现特别好玩的一个结果
 *
 * 【消息发送者1 发送消息】第1线程消息
 * 【消息发送者0 发送消息】第1线程消息
 * 【消息发送者2 发送消息】第1线程消息
 *
 * 5、上述这种情况就是多线程带来的线程安全的问题，三个线程去设置Message对象，操作setMessage，而且它是Static关键字修饰的。
 *    当第一个线程设置好还没发第二个线程就来了，会出现数据覆盖，不同步。因为Static是所有对象可以保存的空间。
 * 6、接下来我们使用ThreadLocal类解决，多个线程并发下的数据安全问题，查看NewThreadLocalDemo
 * @author: yuhang
 * @create: 2019-09-10 21:10
 **/
public class ThreadLocalDemo {
    public static void main(String[] args) {
        for (int x = 0; x < 3; x++){
            int num = x;
            new Thread(()->{
                Message msg = new Message();
                msg.setInfo("第"+ num + "线程消息" );
                Channel.setMessage(msg);
                Channel.send();
            },"消息发送者"+x).start();
        }
    }
}

class Channel {
    private  static Message message;
    public static void setMessage(Message msg) {
        message = msg;
    }

    public  static void send() {
        System.out.println("【" + Thread.currentThread().getName() + " 发送消息】" + message.getInfo() );
    }
}

class Message {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
