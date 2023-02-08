import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // 1. 声明 & 创建
        int arr[] = new int[10];
        int arr2[] = new int[] { 1, 2, 3 };
        int arr3[] = { 1, 2, 3 };

        // 错误：int arr3[] = new int [];
        // 要么初始化，要么给大小

        // 2. 两种遍历方式

        for (int i = 0; i < arr.length; i++)
            arr[i] = i;

        /*
         * for(int ele:arr)
         * System.out.println(ele);
         */

        System.out.println(arr2.length);
        System.out.println(arr2);
    }

}
