package Enum;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: test
 * @description: 定义一个人，性别让用户自定义，通过枚举来实现
 * @author: yuhang
 * @create: 2019-09-02 19:40
 **/

enum Sex {
    MALE("男",1),
    Female("女",2);
    private String title;
    private Integer code;

    private Sex(String title,Integer code) {
        this.title = title;
        this.code =code;
    }
    public String toString(){
        return "我的性别是"+this.title+",编号是:"+this.code;
    }

    static Map<Integer, String> enumMap = new HashMap<Integer, String>();

    static {
        for (Sex status : Sex.values()) {
            enumMap.put(status.getCode(), status.getDisplayName());
        }
    }
    public Integer getCode() {
        return code;
    }


    public String getDisplayName()
    {
        return title;
    }

    public static String getDisplayName(Integer code) {
        return enumMap.get(code);
    }
}

@Data
public class Person {
    private String name;
    private Integer age;
    private Sex sex;

    public Person(String name, Integer age, Sex sex){
        this.name=name;
        this.age =age;
        this.sex = sex;
    }
}
