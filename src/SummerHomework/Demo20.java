package SummerHomework;

public class Demo20 {
    /*任务20：利用递归方法求5!
用递归方式求出阶乘的值。递归的方式为：
5!=4!*5
4!=3!*4
3!=2!*3
2!=1!*2
1!=1
即要求出5!，先求出4!；要求出4!，先求出3! … 以此类推。
要求：
定义一个函数(或方法)，用于求阶乘的值。
在主函数(或主方法)中调用该递归函数(或方法)，求出5的阶乘，并输出结果。*/
    public static void main(String[] args) {

        System.out.println(m(5));

    }
   static int m(int i){
       if (i==1){
           return 1;
       }else {
        return i*m(i-1);
       }
    }
}
