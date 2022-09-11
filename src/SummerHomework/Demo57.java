package SummerHomework;

import java.util.Scanner;

/*任务57：输入一个不多于5位的正整数，要求：1．输出它是几位数；2．逆序打印出各位数字。例如，输入256，则先输出3，再输出652。
要求：使用分支或循环结构语句实现。*/
public class Demo57 {
    public static void main(String[] args) {
            System.out.print("请输入一个5位以内的正整数:");
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n < 0 || n > 1000000) {
                System.out.println("输入有误,请重新输入");
            } else {
                System.out.println("这个数为" + getDigits(n) + "位");
                reversePrint(n);
            }
            in.close();
        }
        public static int getDigits(int n) {
            int count = 0; // 记录位数
            while (n > 0) {
                if (n % 10 != 0) {
                    count++;
                }
                n /= 10;
            }
            return count;
        }
        // 逆序打印
        private static void reversePrint(int n) {
            System.out.print("逆序输出: ");
            while (n > 0) {
                if (n % 10 != 0) {
                    System.out.print(n % 10 +" ");
                }
                n /= 10;
            }

    }
}
