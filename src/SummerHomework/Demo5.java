package SummerHomework;

import java.util.Scanner;

public class Demo5 {
    /*任务5：数列的定义如下：
数列的第一项为n，以后各项为前一项的平方根，输出数列的前m项的和。
要求：数列的各项均为正数。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组的第一项");
        int i = scanner.nextInt();
        System.out.println("请输入这个数组的总数");
        int m = scanner.nextInt();
        double[] arr=new double[m];
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (i1==0){
                arr[i1]=i;
            }else if (i1!=0){
                arr[i1]=Math.sqrt(arr[i1-1]);
            }
        }
        double a=0;
        for (int i1 = 0; i1 < arr.length; i1++) {
          a+=arr[i1];
        }
        System.out.println(a);
    }
}
