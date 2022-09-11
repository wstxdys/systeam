package SummerHomework;

import java.util.Scanner;

public class Demo31 {
    /*任务31：编写一个程序，对用户输入的任意一组字符如{3，1，4，7，2，1，1，2，2}，输出其中出现次数最多的字符
    ，并显示其出现次数。如果有多个字符出现次数均为最大且相等，则输出最先出现的那个字符和它出现的次数。例如，上面输入的字符集合中，
    “1”和“2”都出现了3次，均为最大出现次数，因为“1”先出现，则输出字符“1”和它出现的次数3次。
要求：使用分支、循环结构语句实现。*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[10];
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            char c = sc.next().charAt(0);
            arr[i] = c;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr1[i] = arr1[i] + 1;
                }

            }
            /*   System.out.println(arr);*/
        }
        int[] arr2 = new int[10];
        int max = arr1[0];

        int index = arr2[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
                System.out.println("字符" + arr[i] + " 出现次数最多为" + max + "并且最先输入");
            }
        }
    }
}
