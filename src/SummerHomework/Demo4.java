package SummerHomework;

import java.util.Scanner;

public class Demo4 {
    /*任务4：输入一个百分制的成绩t，将其转换成对应的等级然后输出，具体转换规则如下：
90~100为A
80~89为B
70~79为C
60~69为D
0~59为E
要求：如果输入数据不在0~100范围内，请输出一行：“Score is error!”。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩");
        int i = scanner.nextInt();
        if (i>=90&&i<=100){
            System.out.println("他的成绩为A");
        }else if (i>=80&&i<=89){
            System.out.println("他的成绩为B");
        }else if (i>=70&&i<=79){
            System.out.println("他的成绩为C");
        }else if (i>=60&&i<=69){
            System.out.println("他的成绩为D");
        }else if (i>=0&&i<=59){
            System.out.println("他的成绩为E");
        }else {
            System.out.println("Score is error!");
        }

    }
}
