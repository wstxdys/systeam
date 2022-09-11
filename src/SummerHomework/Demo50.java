package SummerHomework;

import java.util.Scanner;

public class Demo50 {
    /*任务50：输入一行字符，输出其中的字母的个数。例如输入“Et2f5F218”，输出结果为4。
要求：综合使用分支、循环结构语句实现。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        char[] chars = next.toCharArray();
        int a=chars.length;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case '1':
                    a=a-1;
                    break;
                case '2':
                    a=a-1;
                    break;
                case '3':
                    a=a-1;
                    break;
                case '4':
                    a=a-1;
                    break;
                case '5':
                    a=a-1;
                    break;
                case '6':
                    a=a-1;
                    break;
                case '7':
                    a=a-1;
                    break;
                    case '8':
                    a=a-1;
                    break;
                    case '9':
                    a=a-1;
                    break;
                case '0':
                    a=a-1;
                    break;
            }
        }
        System.out.println(a);
    }
}
