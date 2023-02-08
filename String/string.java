package String;

public class string {

    public static void main(String[] args) {

        // 方法1：直接赋值
        /*
         * 注意：使用此方法直接赋值时 系统会检查
         * 该字符串在串池（在堆内存 new出来的对象都在堆内存）
         * 中是否存在 不存在时创建新的 存在则直接复用
         * 复用：因为String是一个类 所以会创建对象
         * 又因为对象是引用数据类型 所以拿到堆内存里面
         * 相同的地址
         * 
         * 方法运行的时候进栈 在栈内存中
         */
        String s1 = "abc";
        System.out.println(s1);

        // 方法2:new 一个字符串对象
        // 空参构造
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        // 方法3:new 一个字符串对象
        // 带参构造
        String s3 = new String("abc");
        System.out.println(s3);

        // 方法4:new 一个字符串对象
        // 用一个字符数组作为参数
        /*
         * 先在堆内存创建数组 
         * 然后栈内存的str1拿到堆内存此数组的地址
         * 
         * 此方法创建的字符串对象不会复用
         * 有较多相同字符串容易浪费内存
         */
        
        char[] str1 = { 'a', 'b', 'c' };
        String s4 = new String(str1);
        System.out.println(s4);

        // 方法5:new 一个字符串对象
        // 用一个字节数组作为参数 转换为ascii码值
        byte[] str2 = { 97, 98, 99 };
        String s5 = new String(str2);
        System.out.println(s5);

        
    }

}
