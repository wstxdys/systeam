package SummerHomework;

import java.util.Scanner;

public class Demo16 {/*任务16：编写函数fun，它的功能是：求Fibonacci数列中大于t的最小的一个数
，结果由函数返回。其中Fibonacci数列F(n)的定义为：F(0)=0，F(1)=1， F(n)=F(n－1)＋F(n－2)
例如：当t = 1000时，函数值为：1597。
要求： 用循环语句实现*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int fun = new Demo16().fun(i);
        System.out.println(fun);

    }
    int fun(int i) {
     int[] arr=new int[i+1];
        int index=2;
        while (true){
            arr[0]=0;
            arr[1]=1;
            arr[index]=arr[index-1]+arr[index-2];
            if (arr[index]>=i){
                return arr[index];
            }
            index++;
        }
    }
}

