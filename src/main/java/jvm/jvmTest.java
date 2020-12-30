package jvm;

/**
 * @program: test
 * @description: VM   -verbose gc-Xms20M-Xmx20M-Xmn10M-XX +PrintGCDetails -XX SurvivorRatio=8
 * @author: yuhang
 * @create: 2020-06-28 14:38
 **/
public class jvmTest {
    private static final int _1MB = 1024 * 1024;
    private static final int _100KB = 1024 * 100;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4, allocation5;
        allocation1 = new byte[2 * _1MB];
//        allocation2 = new byte[2 * _1MB];
//        allocation3 = new byte[2 * _1MB];
//        allocation4 = new byte[4 * _1MB];
//        allocation5 = new byte[3 * _1MB];

    }


}
