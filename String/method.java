package String;

import java.util.Scanner;

/*
 *  String 类提供的方法
 * 
 *  1. charAt()
 *  2. length()
 *  3. subString()
 *  4. replace()
 * 
 *  补充：字符串的拼接: str=str+"a";
 *  不过在有大量次操作的效率极低
 *  通常先转化成StringBuilder对象,然后使用append()方法
 * 
 */

public class method {

    public static void main(String[] args) {

        // 1.比较
        /*
         * ==号
         * 对于基本数据类型 == 号比较的是数据值
         * 引用数据类型比较的则是地址值
         * 
         * 比较字符串对象中的内容是否相等
         * s1.eaquls(s2)
         * 
         * 比较字符串对象中的内容是否相等 忽略大小写
         * s1.equalsIgnoreCase(s2)
         * 
         * 结论: 只用equals进行字符串比较
         * 
         */

        String s1 = "abc"; // 串池地址
        String s2 = "abc"; // 串池地址
        String s3 = "aaa"; // 串池地址
        String s4 = new String("abc"); // 堆中地址

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        Scanner scan = new Scanner(System.in);
        String s5 = scan.next(); // "abc"
        // next()方法 得到的String是new出来的
        System.out.println(s1 == s5); // false


        // 字符串的遍历
        /*
         * 1. 字符串某个位置的字符
         *    str[i] --> str.charAt(i)
         * 
         * 2. 字符串的长度
         *    str.length()
         * 
         * 注意：数组的长度是一个属性 字符串的长度是方法
         *     arr.length
         *  
         * 3. 拼接
         *    str = str + "a"
         * 
         * 4. 子序列
         *    str1 = str.substring(int beginindex, int endindex)
         *    str1 = str.substring(int beginindex) 截取到末尾
         *      
         * 注意：包括beginindex 不包括endindex
         *      
         * 5. 替换
         *    str1 = str.repalce("TMD", "***");
         * 
         */

        scan.close();
    }

}
