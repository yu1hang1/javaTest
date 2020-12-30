package Generics;

/**
 * @program: Builder.test
 * @description: 1、泛型出自JDK1.5之后，主要是为了解决object接收所有数据类型存在的安全隐患。此安全隐患在编译中没有错误，但是在运行中会抛classCastException异常。
 * 2、原因是因为object涵盖范围太广，向下转型有安全隐患
 * @author: yuhang
 * @create: 2019-08-22 19:00
 **/

public class GenericsTest {
    /**
     * 用object修饰泛型问题引出
     */
    public static void ExceptionDemo() {
        PointUseObject pointUseObject = new PointUseObject();
        pointUseObject.setX(10);
        pointUseObject.setY("20");
        int x = (Integer) pointUseObject.getX();
        int y = (Integer) pointUseObject.getY();
        System.out.println("横坐标为：" + x + "纵坐标为：" + y);
    }

    /**
     * 1、用T修饰泛型，T的含义是type，在创建类是用这个修饰后，表明该类的实际类型，由后面创建对象时进行指定
     * 2、如果不设置泛型，自动将使用object作为类型，以保证程序的正常执行，但是在编译的过程中会出现警告信息
     * 3、一旦设置泛型之后，里面的x与y的属性类型就当前对象直接绑定了
     */
    public static void correct() {
        PointUseT<Integer> pointUseT = new PointUseT();
        pointUseT.setX(10);
        pointUseT.setY(20);
        int x = pointUseT.getX();
        int y = pointUseT.getY();
        System.out.println("横坐标为：" + x + "纵坐标为：" + y);
    }

    /**
     * 泛型带来引用传递的问题
     * 1、当一个方法接收的变量为泛型修饰的对象时，它的类型可能就会被指定死了，所以当泛型类型发生变化时，就需要重新创建新的对象然后传递过去
     * 2、这个时候我们需要借助通配符"?"，在引用传递中代替泛型类型，这样该方法就可以接受任何类型的对象了
     * 3、如果不适用通配符，也不使用泛型，
     * 4、用extends类：设置泛型的上限:
     * -例如:定义"? extends Number"：表示该泛型类型值允许设置Number，或Number的子类
     * 用?super类：设置泛型的下限:
     * -例如:定义"？super String ":只能使用String或其父类
     */
    public static void deliver(PointUseT<?> pointUseT) {
        System.out.println(pointUseT.getX());
    }

    /**
     * 含有泛型修饰的方法被称为泛型方法
     * 该方法指明接收参数是一个数组，返回值是一个数组
     */
    public static <T> T[] fun(T... args) {
        return args;
    }

    public static void main(String[] args) {
//        ExceptionDemo();
        correct();
        PointUseT<String> pointUseTA = new PointUseT();
        pointUseTA.setX("1");
        PointUseT<Integer> pointUseTB = new PointUseT();
        pointUseTB.setX(20);
        deliver(pointUseTA);
        deliver(pointUseTB);
        Integer num[] = fun(1, 2, 3);
        for (int tmp : num) {
            System.out.println(tmp);
        }

    }

}
