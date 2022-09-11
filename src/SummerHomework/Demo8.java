package SummerHomework;

import java.util.Scanner;

public class Demo8 {
    /*任务8： 输入n(n<100)个整数，找出其中最小的数，将它与最先输入的数交换后输出这些数。
要求： 用数组解决任务。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请问要输入几个整数");
        int i = scanner.nextInt();
        System.out.println("请输入");
        int[] arr=new int[i];
        int min=0;
        int c=0;
        for (int i1 = 0; i1 < arr.length; i1++) {
          arr[i1]=scanner.nextInt();

            min=arr[0];
            if (min>arr[i1]){
                min=arr[i1];
                c=i1;
            }
        }
        int a=arr[0];
        arr[0]=arr[c];
        arr[c]=a;
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.println(arr[i1]);
        }
    }
}
