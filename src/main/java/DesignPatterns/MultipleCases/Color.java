package DesignPatterns.MultipleCases;

import lombok.Data;

/**
 * @program: test
 * @description: 【多例】
 * 1、与单例对应，通过构造方法进行限制，使其外部无法创建对象
 * 2、与单例不同的是，在类内部创建多个对象
 * 3、本例是根据不同的传参创建不同的对象
 * @author: yuhang
 * @create: 2019-09-02 19:08
 **/
@Data
public class Color {
    private final static Color RED = new Color("红色");
    private final static Color Blue = new Color("蓝色");
    private final static Color Green = new Color("绿色");
    private String title;

    private Color(String title) {
        this.title = title;
    }

    public static Color getInstance(String color){
        switch (color){
            case "红色" : return RED;
            case "蓝色" : return Blue;
            case "绿色" : return Green;
            default:return null;
        }
    }
}
