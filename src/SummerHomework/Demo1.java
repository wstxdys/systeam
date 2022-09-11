package SummerHomework;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int i = scanner.nextInt();
        if (i%4==0&&i%100!=0||i%400==0){
            System.out.println(i+"是闰年");
        }else {
            System.out.println(i+"不是闰年");
        }
    }
}
