package qaa;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        /*int counter=0;
        int counter1=0;
        int ans =0;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int []arr=new int[100];
        for (int i = 2; i <= arr.length; i=i+2) {

            counter++;
           counter1+=2;
            sum=sum+i;
            if (counter==m&&m>3){
                ans=sum/counter;
                sum=0;
                counter=0;
                System.out.println(ans);
                continue;
            }
            if (counter1==arr.length){
                System.out.println(sum/counter);
            }
        }*/
       /* 有一个长度为n(n<=100)的数列，该数列定义为从2		开始的递增有序偶数，现在要
        求你按照顺序每m个数求出一个平均值，如果最后不足m个，则以实际数量求平均值。编程输
        出该平均值序列。
        要求：m为大于等于3的整数。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n");
        int n = sc.nextInt();
        int[] arr=new int[n];
        int sum=2;
        while (true){
            if (n<=100){
                break;
            }
            System.out.println("请重新输入n的数");
            n=sc.nextInt();
        }

        System.out.println("请输入m");
        int m=sc.nextInt();
        while (true){
            if (m>=3){
                break;
            }
            m=sc.nextInt();
            System.out.println("请重新输入m的数");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sum;
            sum+=2;
        }
        System.out.println(Arrays.toString(arr));
        int re=0;
        int sum1=n%m;
        for (int i = 0; i <arr.length ; i++) {
            re=re+arr[i];
            if ((i+1)%m==0){
                System.out.print(re/m+" ");
                re=0;
            }


        }
        if (re!=0){
            System.out.print(re/sum1);
        }
    }
}
