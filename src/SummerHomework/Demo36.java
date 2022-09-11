package SummerHomework;

import java.util.Scanner;

public class Demo36 {
    /*任务36：输入一个5位正整数，输出它是不是回文数。回文数是这样一种数，它的逆序数和它本身相等。例如，12321的逆序数是12321
    ，和它本身相等，所以它是回文数。又例如25128的逆序数是82152，所以它不是回文数。
要求：使用分支或循环结构语句实现*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个5位正整数");
        int i = scanner.nextInt();
        if (i<10000||i>100000){
            System.out.println("输入错误，请重新输入");
            i = scanner.nextInt();
        }
        int a=i%10;
        int b=i%100/10;
        int c=i%1000/100;
        int d=i%10000/1000;
        int e=i%100000/10000;
        int sum=a*10000+b*1000+c*100+d*10+e;
        if (i==sum){
            System.out.println("这是一个回文数");
        }else {
            System.out.println("这不是一个回文数");
        }
    }
}
