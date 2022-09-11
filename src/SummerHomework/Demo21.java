package SummerHomework;

public class Demo21 {
    /*任务21：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13 … 求出这个数列的前20项之和。
要求：利用循环计算该数列的和。注意分子分母的变化规律。
提示：
a1=2,      b1=1,     c1=a1/b1;
a2=a1+b1,  b2=a1,    c2=a2/b2;
a3=a2+b2,  b3=a2,    c3=a3/b3;
…
s = c1+c2+…+c20;
s即为分数序列：2/1，3/2，5/3，8/5，13/8，21/13 … 的前20项之和。*/
    public static void main(String[] args) {

            double a=2;
            double b=1;
            double c=0;
            double sum1=0;
        for (int i = 0; i < 20; i++) {
            sum1+=a/b;
            c=b;
            b=a;
            a+=c;
        }
        System.out.println(sum1);
    }


}
