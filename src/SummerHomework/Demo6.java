package SummerHomework;

import java.util.Scanner;

public class Demo6 {
    /*任务6：多项式的描述如下：1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + ...，现在要求出该多项式的前n项的和。
要求：结果保留小数。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("现有一个多项式，现在请你确定他现在一个有多少个多项式");
        int i = scanner.nextInt();
        int a=0;
        double b=0;
        double c=0;
       while (true){
           a++;
          double s=(a*2)-1;
          double e=a*2;
          if (a!=0){
              b=(1/s)-(1/e);
          }
           c=c+b;
           if (a>i){
               break;
           }
       }
        System.out.println("这个多项式的结果为"+c);
    }
}
