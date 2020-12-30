package Thread;

/**
 * @program: test
 * @description: 在Channel核心结构不改变得情况下，我么需要考虑到每个线程的独立操作问题。
 * 对于Channel类 除了要保证再这样保留发送的消息之外，还应该多存放一个每一个线程的唯一标记（当前线程）
 * 这个时候就可以通过ThrLocal来存放。在ThreadLocal类里面提供如下操作方法：
 * 构造方法：public ThreadLocal();
 * 设置数据：public void set(T value);
 * 取出数据：public T get();
 * 删除数据：public void remove();
 * @author: yuhang
 * @create: 2019-09-10 21:59
 **/
public class NewThreadLocalDemo {
    public static void main(String[] args) {
        for (int x = 0; x < 3; x++) {
            int num = x;
            new Thread(() -> {
                Message msg = new Message();
                msg.setInfo("第" + num + "线程消息");
                newChannel.setMessage(msg);
                newChannel.send();
            }, "消息发送者" + x).start();
        }
    }

}

class newChannel {
    private static final ThreadLocal<Message> THREADLOCAL = new ThreadLocal<Message>();
    public static void setMessage(Message msg) {
        THREADLOCAL.set(msg);//存的时候会把当前线程对象存进去，取得时候也会根据线程对象进行取。这样有一个独立空间，相当于k v的，k就是当前线程，v就是存的数据
    }

    public static void send() {
        System.out.println("【" + Thread.currentThread().getName() + " 发送消息】" + THREADLOCAL.get().getInfo());
    }
}

