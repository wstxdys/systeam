package SummerHomework;

import java.util.Scanner;

public class Demo13 {
    /*任务13：  小明今年3岁了, 现在他已经能够认识100以内的非负整数, 并且能够进行100以内的非负整数的加法计算。
    对于大于等于100的整数, 小明仅保留该数的最后两位进行计算, 如果计算结果大于等于100, 那么小明也仅保留计算结果的最后两位。
例如, 对于小明来说:
1) 1234和34是相等的
2) 35+80=15
要求：给定非负整数A和B，编程代表小明计算出A+B的值，并输出结果。*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数");
        int B = sc.nextInt();
        int A = sc.nextInt();
        if (A >= 100) {
            A = A % 100;
        } else if (A < 100&&A>=0) {
            A = A;
        }

        if (B >= 100) {
            A = A % 100;
        } else if (B < 100&&B>=0) {
            B = B;
        }


        int sum = 0;
        int c = 0;
        c = A + B;
        if (A + B > 100) {
            sum = c % 100;

        } else if (A + B < 100) {
            sum = A + B;
        }

        System.out.println("您的结果为：" + sum);
    }
}
