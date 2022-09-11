package SummerHomework;

import java.util.Scanner;

public class Demo54 {
    /*任务54：当n=5，求表达式为： 1/1！+1/2！+1/3！+…+1/n！的值，保留4 位小数位
    。其中n！表示n的阶乘，例如3！=3×2×1=6，5！=5×4×3×2×1=120。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
        int a=1;
        double b=0;

        for (int i = 1; i <=v ; i++) {
            b=b+1/Demo54.m(i);
        }
        System.out.println(b);
    }
      static public double m(double i){
        if (i==1){
            return 1;
        }else {
            return (i*m(i-1));
        }
    }
}
