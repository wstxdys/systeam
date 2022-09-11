package qaa;

import java.util.Arrays;
import java.util.Scanner;
/*输入n(n<100)个整数，找出其中最小的数，将它与最先	输入的数交换后输出这些
        数。
        要求：用数组解决任务。*/

public class Demo2 {
    public static void main(String[] args) {


        int temp = 0;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        int[] arr = new int[10];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
           /* System.out.println("请输入第" + (i + 1) + "个数");*/
            arr[i] = sc.nextInt();
            if (i == 0) {
                min = arr[0];

            }
            if (arr[i] < min) {
                min = arr[i];
                index = i;

            }
        }
        arr[index]=arr[0];
        arr[0]=min;
        System.out.println(Arrays.toString(arr));
       /* System.out.println("下标" + index);
        for (int i = 0; i < arr.length; i++) {
            temp = arr[0];
            arr[0] = arr[index];
            arr[index] = arr[0];

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }*/
    }
}
