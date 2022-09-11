package SummerHomework;

import java.util.Scanner;

public class Demo59 {
    //    任务59：编写程序实现：
//            ①定义一个大小为10的整形数组a；
//            ②从键盘输入10个整数，放置到数组a中；
//            ③输出数组a中的最大值。
//    要求：使用数组、循环结构语句实现。
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; ) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "个数：");
            if (input.hasNextInt()) {
                int num = input.nextInt();
                a[i] = num;
                i++;
            } else {
                System.out.println("请输入一个整数！");
            }
        }
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }

        }
        System.out.println("最大值为：" + max);
    }
}
