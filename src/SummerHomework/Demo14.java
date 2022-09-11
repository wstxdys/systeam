package SummerHomework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo14 {
    /*任务14：输入三个字符后，按各字符的ASCII码从小到大的顺序输出这三个字符。
要求：用循环语句实现*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[3];

        for (int i = 0; i < arr.length; i++) {
            char c=sc.next().charAt(0);
            arr[i]=c;

        }
        Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));
    }
}
