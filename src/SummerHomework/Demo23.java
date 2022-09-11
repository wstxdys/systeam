package SummerHomework;

import java.util.Scanner;

public class Demo23 {
    /*任务23：输入一批学生成绩，以-1作为结束标记 。统计这批学生中，不及格（score<60）、及格（60<=score<70）
    、中等（70<=score<80）、良好（80<=score<90）、优秀（90<=score<=100）的人数。
要求：使用分支、循环结构语句实现。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生成绩，输入-1结束输入");
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        while (true){
            int i = scanner.nextInt();
            if (i<60&&i>0){
                a++;
            }else if (i>=60&&i<=70){
                b++;
            }else if (i>=70&&i<=80){
                c++;
            }else if (i>=80&&i<=90){
                d++;
            }else if (i>=90&&i<=100){
                e++;
            }else if (i==-1){
                break;
            }
        }
        System.out.println("不及格有"+a+"人，及格有"+b+"人，中等有"+c+"人，良好有"+d+"人，优秀有"+e+"人");
    }
}
