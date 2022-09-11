import java.util.Random;
import java.util.Scanner;

public class Text6 {


    public static void main(String[] args) {
        int counter;
        counter =0;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int var = r.nextInt(99);
        for (int i = 0; i <= 10; i++) {
            int a = sc.nextInt();
            counter++;
            if (a==var&&counter==i){
                System.out.println("您真有才");
                break;

            }else if(a==var&&counter>=2&&counter<=6){
                System.out.println("你真聪明");
                break;
            }else if (a==var&&counter>6&&counter<=9){
                System.out.println("还要继续加油哦");
            }else if (a>var){
                System.out.println("太大了");
            }else if (a<var){
                System.out.println("太小了");
            }else if(counter>6){
                System.out.println("还要继续加油");
                break;
            }
            System.out.println(var);
        }


    }

    public static class Damo1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random a = new Random();
            int i = a.nextInt(99);
            int count = 0;
            for (;true;){
                int c = sc.nextInt();
                count++;
                if (c==i){
                    break;

                }else if (c>i){
                    System.out.println("太大了");
                }else{
                    System.out.println("太小了");
                }
            }
            if (count==1){
                System.out.println("您真有才");
            }else if (count>=2&&count<=6){
                System.out.println("您真棒");
            }else {
                System.out.println("您还要加油哦");

            }
            System.out.println(i);
        }
    }
}