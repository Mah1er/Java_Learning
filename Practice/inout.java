package Practice;


import java.util.Scanner;

public class inout {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        if(scan.hasNextInt())
        {
            int value=scan.nextInt();
            System.out.println(value%10);
            while((value/10)!=0)
            {
                value/=10;
                System.out.println(value%10);
                
            }
        }
        scan.close();
    }

}
