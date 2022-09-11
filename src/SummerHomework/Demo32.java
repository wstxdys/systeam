package SummerHomework;

import java.util.Scanner;

public class Demo32 {
    /*任务32：求n以内（不包括n）同时能被3和7整除的所有自然数之和的平方根s，然后将结果s输出。例如若n为1000时，则s=153.909064。
要求：使用循环语句结构实现。 ②n由键盘输入，且100 ≤ n ≤10000。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n");
        int i = scanner.nextInt();
        if (i<100||i>1000){
            System.out.println("输入错误，请重新输入");
            i = scanner.nextInt();
        }
       double sum=0;

        for (int i1 = 1; i1 <= i; i1++) {
            if (i1%3==0&&i1%7==0){
                sum+=i1;
            }
        }
        System.out.println(Math.sqrt(sum));
    }
}
