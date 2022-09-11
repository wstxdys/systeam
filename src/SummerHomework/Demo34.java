package SummerHomework;

import java.util.Scanner;

public class Demo34 {
    /*任务34：请编写函数(或方法)fun，其功能是：将两个两位数的正整数a、b合并形成一个整数放在c中。
    合并的方式是：将a数的十位和个位数依次放在c数个位和十位上，b数的十位和个位数依次放在c数的百位和千位上。
例如，当a=16、b=35时，则c=5361。
其中，a、b为函数(或方法)fun的输入参数，c为函数(或方法)fun的返回值。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两位正整数");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b<10||b>99||a<10||a>99){
            System.out.println("输入错误，请重新输入");
            b = scanner.nextInt();
            a = scanner.nextInt();
        }
        int c=(b%10)*1000+(b/10)*100+(a/10)+(a%10)*10;
        System.out.println(c);
    }
}
