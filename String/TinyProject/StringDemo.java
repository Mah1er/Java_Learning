package String.TinyProject;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {

        String rightUsername = "Mah1er";
        String righPasswordString = "080116Ll";

        int timesAllowed = 3;

        for (int i = 0; i < timesAllowed; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = scanner.next();
            System.out.println("请输入密码");
            String password = scanner.next();

            if (username.equals(rightUsername) &&
                    password.equals(righPasswordString)) {
                System.out.println("用户登陆成功");
                break;
            } else {
                if (i != 2) {
                    System.out.println("用户登陆失败，用户名或密码有误" +
                            "你还剩下" + (timesAllowed - i - 1) + "次机会");
                } else {
                    System.out.println("账号已被锁定");
                }

            }

            scanner.close();
        }
    
    }

}
