package SummerHomework;

import java.util.Scanner;

public class Demo38 {
    /* 任务38：Lee的老家住在工业区，日耗电量非常大。
今年7月，传来了不幸的消息，政府要在7、8月对该区进行拉闸限电。政府决定从7月1日起停电
，然后隔一天到7月3日再停电，再隔两天到7月6日停电，依次下去，每次都比上一次长一天。
Lee想知道自己到家后到底要经历多少天倒霉的停电。请编写程序帮他算一算。
要求：从键盘输入放假日期、开学日期，日期限定在7、8月份，且开学日期大于放假日期，然后在屏幕上输出停电天数。
提示：可以用数组标记停电的日期*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入放假月份：");
        int fmonth = sc.nextInt();
        System.out.println("请输入放假日期：");
        int fday = sc.nextInt();

        System.out.println("请输入开学月份：");
        int kmonth = sc.nextInt();
        System.out.println("请输入开学日期：");
        int kday = sc.nextInt();

        //定义日期数组
        int[] arr = new int[62];

        //标记停电的日子,用1进行标记
        int space=1;
        for(int i = 0;i<arr.length;i=i+space){
            arr[i] = 1;     //标记
            space++;
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int sum = 0;       //停电的天数
        if (fmonth==7 &&kmonth==8){
            for (int i = fday-1;i<kday-1+31;i++){
                if (arr[i]==1){
                    sum++;
                }
            }
        }
        if(fmonth==7 && kmonth==7){
            for (int i=fday-1;i<kday-1;i++){
                if (arr[i]==1){
                    sum++;
                }
            }
        }
        if (fmonth==8 && kmonth==8){
            for (int i = fday+31-1;i<kday+31-1;i++){
                if (arr[i]==1){
                    sum++;
                }
            }
        }
        System.out.println("停电总天数："+sum);
    }
}
