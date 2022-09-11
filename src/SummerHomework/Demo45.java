package SummerHomework;

public class Demo45 {
    /*任务45：编程实现判断一个整数是否为素数。所谓素数是一个大于1的正整数，除了1和它本身，该数不能被其它的正整数整除。
要求：用带有一个输入参数的函数(或方法)实现，返回值类型为布尔类型。*/
    public static void main(String[] args) {

        System.out.println( ss(311));
    }
    public static boolean ss(int n){
        boolean aa = true;
            for (int j = 2; j < n/2; j++) {
                if (n%j==0) {
                    aa=false;
                    break;

                }

}
        return aa;
    }
}
