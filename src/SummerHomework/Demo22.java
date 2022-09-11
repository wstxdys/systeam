package SummerHomework;

import java.util.Scanner;

public class Demo22 {
    /*任务22：计算算式1+21+22+23+…+2n 的值。
要求：n由键盘输入，且2 ≤ n ≤10。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("请输入n");
        int a = scanner.nextInt();
        if (a>=2&&a<=10){
            System.out.println("输入正确");
        }else {
            System.out.println("请重新输入");
            a = scanner.nextInt();
        }
        int a1=20;int sum1=1; int c=0 ;
        for (int i1 = 1; i1 <= a; i1++) {
            c=i1+a1;
            sum1+= c;
        }

       System.out.println(sum1+2*a);
        System.out.println("请输入一个正整数：");
        int n=scanner.nextInt();
//String s="2"+n;
        int sum=1;
        for(int i=1;i<=n;i++){
            sum+=Integer.parseInt("2"+i);
        }
        System.out.println(sum);

    }
}
