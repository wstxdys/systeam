package SummerHomework;

import java.util.Scanner;

public class Demo53 {
    /*任务53：输入一行字符，输出其中的数字的个数。例如输入“fwEt2f44F2k8”，输出结果为5。
要求：综合使用分支、循环结构语句实现。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        char[] chars = next.toCharArray();
        int a=0;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case '1':
                   a++;
                    break;
                case '2':
                    a++;
                    break;
                case '3':
                    a++;
                    break;
                case '4':
                    a++;
                    break;
                case '5':
                    a++;
                    break;
                case '6':
                    a++;
                    break;
                case '7':
                    a++;
                    break;
                case '8':
                    a++;
                    break;
                case '9':
                    a++;
                    break;
                case '0':
                    a++;
                    break;
            }
        }
        System.out.println(a);
    }
}
