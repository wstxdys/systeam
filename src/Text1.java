import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        int q = sc.nextInt();
//        int w = sc.nextInt();
//        int e = sc.nextInt();
//        int r = sc.nextInt();
        int b;
        b=0;

        for (int a = 1; a <= 5; a++) {
            System.out.println("输入你每天的学习时间");
            int i = sc.nextInt();
            b=b+i;




        }
        System.out.println("你每周学习时间是“"+b/5+"小时");
    }
}
