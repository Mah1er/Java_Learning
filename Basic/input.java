//1.导包 Scanner
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //2.创建对象，System.in表示从键盘输入数据
        Scanner scan=new Scanner(System.in);

        //3.此对象的方法hasNext()、next()
        if(scan.hasNext())
        {
            String next=scan.next();
            System.out.println("next 方法接收："+next);
        }         
        scan.close();
    }
}


/*常用方法总结：
1.如果要输入一整行带空格的字符串，nextLine()
2.如果要输入 int 或 float 类型的数据，
  输入之前最好先使用 hasNextXxx() 方法进行验证
3.然后使用 nextXxx() 输入 int 或 float 类型的数据
*/
