package Practice;

import java.util.Scanner;

public class ifReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        String revStr = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(revStr));

        scanner.close();
    }

}
