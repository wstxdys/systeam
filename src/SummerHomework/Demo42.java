package SummerHomework;

import java.util.Scanner;

public class Demo42 {
    /*任务42：寻找最大数经常在计算机应用程序中使用。例如：确定销售竞赛优胜者的程序要输入每个销售员的销售量，
    销量最大的员工为销售竞赛的优胜者，编写一个程序：从键盘输入10个数，表示10位员工的销售量，打印出其中最大的数。*/
    public static void main(String[] args) {
        int[] chars=new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10位销售员的销售额");
        for (int i = 0; i < chars.length; i++) {
            chars[i]=scanner.nextInt();
        }
        int max=chars[0];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>max){
                max=chars[i];
            }
        }
        System.out.println("最高的销售额是"+max);
    }
}
