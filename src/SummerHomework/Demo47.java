package SummerHomework;

import java.util.Scanner;

public class Demo47 {
    /*
任务47：输入两个正整数m和n，输出其最大公约数和最小公倍数。
要求：综合使用分支、循环结构语句实现。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=a*b;
        if(a<b){
            int r=0;
            r=a;a=b;b=r;
        }
        while(true){
            int r=a%b;
            if(r==0){
                System.out.println("最小公倍数："+c/b);
                break;
            }else {
                a=b;
                b=r;
            }
        }
        if (a < b) {     // 保证被除数大于除数

            int temp = a;

            a = b;

            b = temp;

        }

        while (a % b != 0) {  // 在余数不能为0时,进行循环

            int temp = a % b;
            System.out.println(temp);
            a = b;

            b = temp;

        }
        System.out.println("最大公约数为"+b);
    }
}
