package SummerHomework;

import java.util.Scanner;

public class Demo49 {
    /*任务49：输入三个整数x、y、z，请把这三个数由小到大输出。
要求：使用分支结构语句实现。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个数");
        int[] arr=new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int temp=arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length-1; i1++) {
                if (arr[i]<arr[i1]){
                    temp=arr[i1];
                    arr[i1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
