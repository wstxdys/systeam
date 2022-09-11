package SummerHomework;

import java.util.Scanner;

public class Demo9 {
    /*任务9： 对于给定的一个字符串，统计其中数字字符出现的次数。
要求： 字符串只能由数字和字符组成。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串,请注意字符串只能输入数字和字符");
        String next = scanner.next();
        char[] chars = next.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0' || chars[i] == '1' || chars[i] == '2' ||
                    chars[i] == '3' || chars[i] == '4' || chars[i] == '5' ||
                    chars[i] == '6' || chars[i] == '7' || chars[i] == '8' || chars[i] == '9') {
                counter++;
            }
            System.out.println("数字字符出现了" + counter + "次");
        }
    }
}
