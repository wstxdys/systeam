package qaa;

public class Demo3 {
    /*编写一个程序找出100～1000之间的所有姐妹素数。
    注：姐妹素数是指相邻两个奇数均为素数。
    要求：使用循环结构语句实现
   质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数；否则称为合数（规定1既不是质数也不是合数）。

*/
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i ++) {
            boolean aa = true;
            for (int j = 2; j <= i/2; j++) {
                if (i%j  == 0) {
                    aa=false;
                    break;

                }else if ((i+2)%j==0){
                    aa=false;
                    break;
                }

            }
            if (aa) {
                System.out.println(i+" "+(i+2));


            }
        }
    }
}

