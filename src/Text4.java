public class Text4 {
    public static void main(String[] args) {
        int b;
        b=0;
        for (int i = 100; i <= 999; i++) {
            int a;
            a=i%10;
            int c;
            c=i%100/10;
            int d;
            d=i/100;
            if (i==a*a*a+c*c*c+d*d*d){
                b=i;


                System.out.println("水仙花数字有："+b);
            }


        }



    }
}
