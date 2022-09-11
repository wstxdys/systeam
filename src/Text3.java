public class Text3 {
    public static void main(String[] args) {
        int sum=0,i;
        for (int j = 1; j <4 ; j++) {
            switch (j){
                case 1:
                    sum=sum+2;
                case 2:
                    sum=sum+4;
                case 3:
                    sum=sum+16;
                    break;
            }

        }
        System.out.println(sum);
    }
}
