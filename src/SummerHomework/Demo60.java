package SummerHomework;

import java.util.Scanner;

public class Demo60 {

        //    任务60：请编写函数(或方法)fun，其功能是：计算正整数n的各位上的数字之积，将结果放到c中。
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x, c;
            System.out.print("请输入正整数:");
            x = sc.nextInt();
            c = arithmetic(x);
            System.out.println(c);
        }
        static int arithmetic(int x) {
            int i, j, c;
            i = x / 10;
            j = x % 10;
            c = i * j;
            return c;
        }

    }
