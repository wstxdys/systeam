package SummerHomework;

public class Demo58 {
    //    任务58：使用循环语句打印出如下图案。
//            *******
//            *****
//            ***
//            *
//    要求：使用循环结构语句实现。
    public static void main(String[] args) {

        int z = 5;
        for (int x = 0; x < 4; x++)
        {
            for (int y = 2; y < 2*z-1; y++)
            {
                System.out.print("*");
            }
            System.out.println();
            z--;
        }
    }
}
