package Exception;

/**
 * @program: test
 * @description: 【throws..try...finally的使用】
 * 在实际开发过程中，这种异常异常处理格式，是最为重要，尤其是当与一些资源访问操作的时候
 * 由此程序可以理解，当产生异常时分为以下情况：
 * 1、不处理，程序直接中断，JVM抛出异常
 * 2、处理：a）catch捕获，在抛出异常处直接吞掉
 *         b）向上抛异常，抛给调用方
 * @author: yuhang
 * @create: 2019-09-19 14:31
 **/

class myMath {
    public static int div(int x, int y) throws Exception {
        int tamp = 0;
        System.out.println("【开始计算】");
        try {
            tamp = x / y;
        } finally {
            System.out.println("【end】");
        }
        return tamp;
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            myMath.div(10, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
