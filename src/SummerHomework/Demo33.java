package SummerHomework;

import java.util.Scanner;

public class Demo33 {
//                                                2 22 222 2222
    /*任务33：输入整数a，输出结果s，其中s与a的关系是：s=a+aa+aaa+aaaa+aa...a，最后为a个a。例如a=2时，s=2+22=24。
要求：①使用循环结构语句实现。②a由键盘输入，且2 ≤ a ≤9。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n");
        int i = scanner.nextInt();
        if (i<2||i>9){
            System.out.println("输入错误，请重新输入");
            i = scanner.nextInt();
        }
        int sum=2;
        for (int i1 = 2; i1 <= i; i1++) {
            sum= (int) (sum+Math.pow(10,i1-1)*i+sum);
        }
        System.out.println(sum);
    }
}
