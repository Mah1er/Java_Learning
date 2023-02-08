import java.util.Scanner;

public class Obj {
    
    // private 修饰成员变量和成员方法
    // 被 private 修饰的成员只能在本类中访问?
    // 意思是 在其他类中 Obj1.age=18是错误的
    private String name;
    private int age;
    private String gender;


    // 构造方法1：默认值都是0，调用时不带参数
    public Obj()
    {
        System.out.println("to see if implemented");
    }

    // 构造方法2：
   
    // 注意 两种构造方法都写的时候构成重载
    // 建议两种构造方法都要写 增强程序健壮性
    public Obj(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void setAge(int age)
    {
        // this 用于区分成员变量和局部变量
        if( age>=18 && age<=50)
            this.age=age;
        else
            System.out.println("非法数据");
    }  
    
    public int getAge()
    {
        return this.age;
    }


  
    
}
