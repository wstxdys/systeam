import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            int a = sc.nextInt();
            if (a%3==0&&a%5==0){
                System.out.println("FLIPFLOP");
            }else if (a%5==0){
                System.out.println("flop");

            }else if (a%3==0){
                System.out.println("flip");
            }else{
                System.out.print(a);
            }

        }
    }
}
