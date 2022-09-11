package SummerHomework;

import java.util.Scanner;

public class Demo46 {
    /*任务46：根据输入的成绩分数，输出相应的等级。“学习成绩>=90分”的同学用A表示，“60<=学习成绩<90”的同学用B表示，60分以下的用C表示。
要求：使用分支结构语句实现*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的成绩");
        int i = scanner.nextInt();
        if (i>100||i<0){
            System.out.println("输入错误，请重新输入");
            i = scanner.nextInt();
        }
        if (i>=90){
            System.out.println("A");
        }else if (i<90&&i>=60){
            System.out.println("B");
        }else if (i>=0&&i<60){
            System.out.println("C");
        }
    }
}
