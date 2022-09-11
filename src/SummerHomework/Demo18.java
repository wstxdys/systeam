package SummerHomework;

import java.util.Scanner;

public class Demo18 {
    /*任务18：从键盘输入两个整数，输出两个整数的最大公约数。
要求： 用循环语句实现*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (m < n) {     // 保证被除数大于除数

            int temp = m;

            m = n;

            n = temp;

        }

        while (m % n != 0) {  // 在余数不能为0时,进行循环

            int temp = m % n;
            System.out.println(temp);
            m = n;

            n = temp;

        }
        System.out.println(n);
    }

}
