package SummerHomework;

public class Demo52 {
    /*
任务52：输出100~999之间的所有素数。所谓素数是一个大于1的正整数，除了1和它本身，该数不能被其它的正整数整除。
要求：综合使用分支、循环结构语句实现。*/
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            boolean aa = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    aa = false;
                    break;


                }
            }
            if (aa) {
                System.out.print(i+" ");


            }
        }
    }
}
