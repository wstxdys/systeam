package SummerHomework;

import java.util.Scanner;

public class Demo51 {
    /*任务51：输入整数a和n，输出结果s，其中s与a、n的关系是：s=a+aa+aaa+aaaa+aa...a，最后为n个a。例如a=2、n=3时，s=2+22+222=246。
要求：①使用循环结构语句实现。②a由键盘输入，且2 ≤ a ≤9。③n由键盘输入，且2 ≤ n ≤9。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n");
        int n = scanner.nextInt();
        System.out.println("请输入a");
        int a = scanner.nextInt();
        if (a>=2&&a<=9||n>=2&&n<=9){
            System.out.println("输入正确");
        }else {
            System.out.println("请重新输入");
            a = scanner.nextInt();
        }
        int sum=0;
        for (double i = 2; i <=n; i++) {
                    sum+=a*Math.pow(10,i-1)+a+sum;
                    if (n==2){
                        sum=a;
                        sum+=a*Math.pow(10,i-1)+sum;
                    }

        }
        System.out.println(sum);
    }
}
