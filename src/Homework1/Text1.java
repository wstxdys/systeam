package Homework1;

public class Text1 {
    int[]aa={5,1,20,25,8};

    public int[] getAa() {
        return aa;
    }

    public void setAa(int[] aa) {
        this.aa = aa;
    }

    void math(int[]aa, String str){
        int temp;
        if (str=="sort"){
            for (int i = 0; i < aa.length; i++) {
                for (int j = 0; j <aa.length-1 ; j++) {
                    if (aa[j]>aa[j+1]){
                        temp=aa[j];
                        aa[j]=aa[j+1];
                        aa[j+1]=temp;
                    }
                }
            }
            for (int i1 = 0; i1 < aa.length; i1++) {
                System.out.print(aa[i1]+" ");
            }
        }else if(str=="max"){
            int max=aa[0];
            for (int i = 0; i < aa.length; i++) {
                if (aa[i]>max){
                    max=aa[i];
                }

            }
            System.out.println("最大值为"+max);
        }
    }
    void math(int[] aa,int num){
    aa=new int[aa.length+num];

        System.out.println(aa.length);
    }
}
