package SummerHomework;

import java.util.Scanner;

public class Demo3 {
    /*任务3：编程实现判断一个字符串是否是“回文串”。所谓“回文串”是指一个字符串的第一位与
    最后一位相同，第二位与倒数第二位相同。例如：“159951”、“19891”是回文串，而“2011”不是。
要求：用带有一个输入参数的函数(或方法)实现，返回值类型为布尔类型。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String next = scanner.next();
        boolean method = new Demo3().method(next);
        System.out.println("这是回文串吗"+method);
    }

    public boolean method(String aaa){
        boolean a=true;
        boolean b=false;
        char[] chars = aaa.toCharArray();

        if (chars[0]==chars[chars.length-1]&&chars[1]==chars[chars.length-2]){
               return a;
            }else {
            return b;
        }

    }


}
