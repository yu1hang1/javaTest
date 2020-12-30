package Generics;

/**
 * @program: Builder.test
 * @description:
 * 1、定义一个坐标类，x，y分别代表横纵坐标
 * 2、变量都用object来修饰
 * @author: yuhang
 * @create: 2019-08-22 19:17
 **/
public class PointUseT<T> {
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    final void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}