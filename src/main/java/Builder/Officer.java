package Builder;
import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: test
 * @description: 【构建器模式 & 链式调用】
 * 1、为什么要使用
 * 若一个类具有大量的成员变量，我们就需要提供一个全参的构造器或大量的set方法。这让实例的创建和赋值，变得很麻烦，且不直观。
 * 我们通过构建器，可以让变量的赋值变成链式调用，而且调用的方法名对应着成员变量的名称。让对象的创建和赋值都变得很简洁、直观。
 * 2、 链式方法赋值，一定要用构建器模式吗？
 * 不一定要用到构建器模式，之所以使用构建器模式，是因为我们要创造的对象是一个成员变量不可变的对象。
 * @author: yuhang
 * @create: 2019-09-02 12:03
 **/
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Officer {

    /**
     * 员工 工号
     */
    @NotNull
    private String id;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工年龄
     */
    private Integer age;
    /**
     * 所属部门
     */
    private String department;
    /**
     * 职位*/
    private String job;

}
