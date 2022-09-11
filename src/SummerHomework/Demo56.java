package SummerHomework;

public class Demo56 {
    /*
任务56：输出1+2!+3!+...+10!的结果。其中n!表示n的阶乘，例如3!=3×2×1=6，5!=5×4×3×2×1=120。
要求：使用循环结构语句实现。
*/
    public static void main(String[] args) {
        int a=0;
        for (int i = 1; i <=10; i++) {
            a+=Demo54.m(i);
        }
        System.out.println(a);
    }
}
