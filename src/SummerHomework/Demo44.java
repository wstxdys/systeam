package SummerHomework;

import java.util.Scanner;

public class Demo44 {
    /*任务44：从键盘输入一个整数N，打印出有N*2-1行的菱形。
例如输入整数4，则屏幕输出如下菱形。

要求：①使用循环结构语句实现，直接输出不计分。②整数N由键盘输入，且2 ≤ N ≤10。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int i1 = 1; i1 <= i; i1++) {
            for (int j = 0; j <=i-i1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i1-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i1 =i- 1; i1 >=1; i1--) {
            for (int j = 0; j <=i-i1 ; j++) {
                 System.out.print(" ");
            }
            for (int j = 0; j <2*i1-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
