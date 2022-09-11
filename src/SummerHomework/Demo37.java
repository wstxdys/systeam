package SummerHomework;

public class Demo37 {
    /*任务37：一个球从100米高度自由落下，每次落地后反弹回原高度的一半，再落下，再反弹。求它在第十次落地时，
    共经过多少米?第十次反弹多高?
要求：使用循环结构语句实现。*/
    public static void main(String[] args) {
        double a=100;
        double i1=0;
        for (int i = 0; i < 10; i++) {
            a-=a/2;
            i1+=a*2;
        }
        System.out.println(a);
        System.out.println(i1+100-a);
    }
}
