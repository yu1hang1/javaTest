package Generics;

/**
 * @program: Builder.test
 * @description:
 * 1、定义一个坐标类，x，y分别代表横纵坐标
 * 2、变量都用object来修饰
 * @author: yuhang
 * @create: 2019-08-22 19:17
 **/
public class PointUseObject {
    private Object x;
    private Object y;

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }
}

