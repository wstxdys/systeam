package SummerHomework;

import java.util.Scanner;

public class Demo7 {
    /*任务7：有一个长度为n(n<=100)的数列，该数列定义为从2开始的递增有序偶数，
    现在要求你按照顺序每m个数求出一个平均值，
    如果最后不足m个，则以实际数量求平均值。编程输出该平均值序列。
要求： m为大于等于3的整数。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组长度");
        int i1 = scanner.nextInt();
        System.out.println("请问需要按多少个输出一个平均值");
        int i2 = scanner.nextInt();
        int[] arr=new int[i1];
        int a=2;
        int counter=0;
        int sum = 0;
        int ang =0;
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=a;
            a+=2;
            counter++;
            sum+=arr[i];
            if (counter==i2){
                ang=sum/i2;
                sum=0;
                counter=0;
                System.out.print(ang+" ");
            }
            if (a==arr.length){
                System.out.println(sum/counter);
            }

        }

    }
}
