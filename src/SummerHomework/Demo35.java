package SummerHomework;

import java.util.Scanner;

public class Demo35 {
    /*任务35：孙悟空在大闹蟠桃园的时候，第一天吃掉了所有桃子总数一半多一个，第二天又将剩下的桃子吃掉一半多一个，
    以后每天吃掉前一天剩下的一半多一个，到第n天准备吃的时候只剩下一个桃子。这下可把神仙们心疼坏了，请帮忙计算一下，第一天开始吃的时候桃园一共有多少个桃子。
要求：①使用循环结构语句实现。②整数N由键盘输入，且2 ≤ N ≤10。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n");
        int i = scanner.nextInt();
        int sum=1;
        int a=1;
        while (true){
            i--;
            sum+=2*(sum+1);
            if (i==1){
                break;
            }
        }
        System.out.println(sum);
    }
}
