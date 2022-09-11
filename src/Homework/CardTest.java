package Homework;

import java.util.Scanner;

public class CardTest {
    public static void main(String[] args) {
        Card bank= new Card("2567189",8888.12,"123456");
        System.out.println("卡号及密码已读取完成");
        System.out.println("请选择你的服务:1：取钱，2:修改密码，3：查看卡号及余额，4,存钱，5：服务完成");
       while (true){
           Scanner sc = new Scanner(System.in);
           int i = sc.nextInt();
           if (i==5){
               System.out.println("希望您对我的服务满意，再见");
               break;
           }
           if (i==1){
               bank.quqian();
               System.out.println("请选择你的下一个服务");
           }

           if(i==2){
               bank.setPassword();
               System.out.println("请选择你的下一个服务");
           }
           /*System.out.println(a);*/
           if (i==3){
             bank.str();
               System.out.println("请选择你的下一个服务");
           }
           if (i==4){
               bank.cye();
           }


       }

    }
}
