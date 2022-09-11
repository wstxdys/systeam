package SummerHomework;

public class Demo26 {
    /*任务26：利用求n!的方法计算 2!+4!+5!的值。n!表示n的阶乘，例如3!=3×2×1=6，5!=5×4×3×2×1=120。
要求：分别利用递归和非递归方法实现求n!。*/
    public static void main(String[] args) {
        int m = new Demo26().m(2);
        int a = new Demo26().m(4);
        int b = new Demo26().m(5);
        int sum=m+a+b;
        int sum1=1;
        int sum2=1;
        int sum3=1;
        for (int i = 1; i <=2; i++) {
            sum1=sum1*i;
        }

        for (int i = 1; i <=4; i++) {
            sum2=sum2*i;
        }   for (int i = 1; i <=5; i++) {
            sum3=sum3*i;
        }
        int sum4=sum1+sum2+sum3;
        System.out.println(sum+" "+sum4);
    }
   public int m(int i){
        if (i==1){
            return 1;
        }else {
            return i*m(i-1);
        }
    }
}
