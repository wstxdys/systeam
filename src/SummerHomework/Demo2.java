package SummerHomework;

public class Demo2 {
    public static void main(String[] args) {
        String a="*";
        char c = a.charAt(0);
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
