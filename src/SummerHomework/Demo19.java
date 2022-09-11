package SummerHomework;

import java.util.Scanner;

public class Demo19 {
    /*任务19：已知某个班有30个学生，学习5门课程，已知所有学生的各科成绩。请编写程序：分别计算每个学生的平均成绩，并输出。（自学二重循环）
要求：
定义一个二维数组A，用于存放30个学生的5门成绩。定义一个一维数组B，用于存放每个学生的5门课程的平均成绩。
使用二重循环，将每个学生的成绩输入到二维数组A中。
使用二重循环，对已经存在于二维数组A中的值进行平均分计算，将结果保存到一维数组B中。
使用循环输出一维数组B（即平均分）的值。*/
    public static void main(String[] args) {
        int[][] arr=new int[2][2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.println("请输入第"+(i+1)+"学生的，第"+(j+1)+"门课的成绩是");
               arr[i][j]=scanner.nextInt();
            }
            int[] arrs=new int[2];
                int avrg=0;
            for (int i1 = 0; i1 < arr.length; i1++) {
                int sum=0;
                for (int j = 0; j <2; j++) {
                         sum=arr[i][j]+sum;
                 /*   System.out.println(sum);*/
                     avrg=sum/2;
                }
            }


            for (int i1 = 0; i1 < arrs.length; i1++) {
                for (int j = 0; j <i ; j++) {
                    arrs[i1]=avrg;


                }
            }
            for (int i1 = 0; i1 < arrs.length; i1++) {
                System.out.println(arrs[i1]);
            }


        }

    }
}
