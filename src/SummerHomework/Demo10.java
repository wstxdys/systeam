package SummerHomework;

import java.util.Scanner;

public class Demo10 {
    /*任务10： 从键盘输入两个整数，输出两个整数的最小公倍数。
要求： 用循环语句实现*/
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
      int c=a*b;
     if(a<b){

         int r=0;
        r=a;a=b;b=r;
        }
     while(true){
        int r=a%b;
         System.out.println(r);
        if(r==0){
        System.out.println("最小公倍数："+c/b);
        break;
        }else {
        a=b;
            b=r;
        }
        }
    }
}
