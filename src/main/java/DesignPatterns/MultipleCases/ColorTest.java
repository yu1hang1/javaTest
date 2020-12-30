package DesignPatterns.MultipleCases;

/**
 * @program: test
 * @description:
 * @author: yuhang
 * @create: 2019-09-02 19:20
 **/
public class ColorTest {
    public static void main(String[] args) {
        Color c1 = c1 = Color.getInstance("红色");
        System.out.println(c1.getTitle());
        Color c2 = Color.getInstance("绿色");
        System.out.println(c2.getTitle());
    }
}
