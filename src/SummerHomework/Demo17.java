package SummerHomework;

import java.util.Scanner;

public class Demo17 {
    /*任务17： 将一个字符串数组中存放的字符倒序存储，即原序列中最后一个字符在倒序后排到第一位，
    原序列倒数第二个字符在倒序后排到第二位，以此类推。
要求：不能借助第二个数组完成字符串数组倒序。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String next = scanner.next();
        char[] chars = next.toCharArray();
        char ia=chars[0];
        for (int i =0; i <chars.length/2; i++) {
           ia= chars[i];
           chars[i]=chars[chars.length-1-i];
           chars[chars.length-1-i]=ia;
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
