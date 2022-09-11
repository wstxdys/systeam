package SummerHomework;

import java.util.Scanner;

public class Demo11 {
    /*任务11： 从键盘输入三条边A，B，C的边长，请编程判断能否组成一个三角形。
要求：  A,B,C <1000，如果三条边长A,B,C能组成三角形的话，输出YES，否则NO。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角形的三条边");
        int i = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (true){
            if (i>1000||a>1000||b>1000){
                System.out.println("你输入错误，请重新输入");
                i = scanner.nextInt();
                a = scanner.nextInt();
                 b = scanner.nextInt();
            }
            if (i+a>b&&b+a>i&&i+b>a){
                System.out.println("yes");
                break;
            }else{
                System.out.println("no");
                break;
            }

        }
    }
}
