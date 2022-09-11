package SummerHomework;

public class Demo40 {
    /*任务40：某班同学上体育课，从1开始报数，共38人，老师要求按1、2、3重复报数，报数为1的同学往前走一步，
    而报数为2的同学往后退一步，试分别将往前走一步和往后退一步的同学的序号打印出来。
要求：用循环语句实现，直接输出结果不计分。*/
    public static void main(String[] args) {
        int num=38;
        int aa=(num/3);
        System.out.println(aa);
        int a=0,b=0;
        System.out.print("向前一步"+"\t"+"后退一步"+"\n");
        for (int i = 0; i <=aa; i++) {
            a=(i*3);
            b=((i*3)+1);
            System.out.println((a+1)+"\t"+(b+1));
        }
}
}
