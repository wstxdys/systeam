package SummerHomework;

import java.util.Scanner;

public class Demo55 {
    /*任务55：使用循环语句打印出如下图案。
     *
***
   *****
  *******
 *********
***********
要求：使用循环结构语句实现。*/
    public static void main(String[] args) {
        for (int i = 0; i<=6; i++) {
            for (int j = 0; j <6-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
