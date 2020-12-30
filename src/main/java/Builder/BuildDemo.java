package Builder;

/**
 * @program: test
 * @description:
 * 【用构建者模式创建一个对象】
 * 1、所有对象打印都是toString
 * @author: yuhang
 * @create: 2019-09-02 12:16
 **/
public class BuildDemo {
    public static void main(String[] args) {
        Officer officer = Officer.builder()
                .id("09945")
                .age(18)
                .name("大傻")
                .department("技术部")
                .job("总工程师").build();
        Officer o1 = new Officer("1","xxxx",22,"aaa","xx");
        o1.setAge(13);
        System.out.println(officer.toString());
        System.out.println(o1);

    }
}
