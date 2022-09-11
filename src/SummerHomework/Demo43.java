package SummerHomework;

import java.util.Scanner;

public class Demo43 {
    /*任务43：从键盘接收一个整数N，统计出1~N之间能被7整除的整数的个数，以及这些能被7整除的数的和。
屏幕提示样例：
请输入一个整数：20
1~20之间能被7整除的数的个数：2
1~20之间能被7整除的所有数之和：21
要求：整数N由键盘输入，且2 ≤ N ≤1000。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n");
        int i = scanner.nextInt();
        int counter=0;
        int sum=0;
        for (int i1 = 1; i1 < i; i1++) {
            if (i1%7==0){
                counter++;
                sum+=i1;
            }
        }
        System.out.println("1~"+i+"之间能被7整除的数的个数："+counter);
        System.out.println("1~"+i+"之间能被7整除的所有数之和："+sum);
    }
}
