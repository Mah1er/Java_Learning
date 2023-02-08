package String;

import java.util.Scanner;

/*
 *
 * StringBuilder 可以看成一个容器 
 * 创建之后里面的内容是可变的
 * 相比String更高效
 * 且封装了更多操作:
 * 1. append()
 * 2. reverse()
 * 3. length()
 * 4. toString()
 * 
 * 
 */

public class BuildJoiner {

    public static void main(String[] args) {

        // 1. 创建
        StringBuilder strb1 = new StringBuilder("abc");
        System.out.println(strb1);

        // 2. 添加
        strb1.append("d"); // 此方法有多个重载
        System.out.println(strb1);

        // 3. 反转
        strb1.reverse();
        System.out.println(strb1);

        // 4. 长度
        int len = strb1.length();
        System.out.println(len);

        // 5. toString()
        System.out.println(strb1.toString());

        // 6. 链式编程
        // int len1 = getString().substring(1).replace("A", "Q").length();
        // System.out.println(len1);



        // System.out.println(stringBuilder);
        // 打印出来的结果:String.BuildJoiner
        // 不是地址 而是属性值

    }

    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String string = scanner.next();
        scanner.close();
        return string;
    }
}
