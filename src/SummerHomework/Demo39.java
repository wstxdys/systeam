package SummerHomework;

import java.util.Scanner;

public class Demo39 {
    /*任务39：编写程序实现：从键盘输入正整数s，从低位开始取出s中的奇数位上的数，依次构成一个新数t，高位仍放在高位
    ，低位仍放在低位，最后在屏幕上输出t。例如，当s中的数为7654321时，t中的数为7531。
要求：使用循环结构语句实现。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int i = scanner.nextInt();
        if (i<0){
            System.out.println("输入错误，请重新输入");
        }
        String a=""+i;
        String B="";
        char[] chars = a.toCharArray();
        for (int i1 =0; i1 < chars.length; i1++) {
            if ((i1+1)%2!=0){
                B+=chars[i1];
            }
        }
        System.out.println(B);
    }
}
