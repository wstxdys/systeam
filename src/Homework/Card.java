package Homework;

import java.util.Scanner;

public class Card {
   private String card = "347508";
  private   String password;
   private double ye;

    public Card(String card, double ye, String password) {
        this.card = card;
        this.password = password;

        if (ye < 0) {
            System.out.println("你的余额错误,并且已将您的余额默认为0");
            this.ye = 0;
        } else {
            this.ye = ye;
        }
    }

    public String getCard() {
        return card;
    }

    public void setPassword() {
        String password2;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原密码");
        password2 = sc.next();
        while (true) {
            if (!(password2.equals(password))) {
                System.out.println("您输入的原密码错误");
                System.out.println("请重新选择并再次输入密码");
                break;

            }
            String password1;
            System.out.println("请输入新密码");
            password1 = sc.next();

            if (password2.equals(password)) {
                System.out.println("输入成功密码已更改");
                this.password = password1;
                break;
            }
        }
    }
    public double getYe() {

        return ye;

    }
    public void setYe(double ye) {
        this.ye += ye;

    }
    public void quqian() {
        System.out.println("请输入密码");
        Scanner sc = new Scanner(System.in);
        String pass = sc.next();
        //double hum = 0;
        while (true) {
            if (!(pass.equals(password))) {
                System.out.println("密码输入错误，请重新输入");
                pass = sc.next();
            } else {
                System.out.println("密码输入成功，请输入您要取的钱：");
                double v = sc.nextDouble();
                if (v>this.ye||ye<0){
                    System.out.println("取钱失败,请重新输入");
                }else {
                    this.ye-=v;
                    System.out.println("取出成功您的余额为" +this.ye );
                    break;
                }

            }
        }
    }
    public void cye() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要存的钱");
        int i = sc.nextInt();
        System.out.println("存入成功");
        this.ye += i;
    }
    public void str() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的密码");
        String i = sc.next();
        while (true) {
            if (!(password.equals(i))) {
                System.out.println("您输入的密码错误,请重新输入");
                i = sc.next();
            }
            if (password.equals(i)) {
                System.out.println("您输入的密码正确，请重新选择");
                System.out.println("BankCard{" +
                        "卡号为'" + card + '\'' +
                        ",余额'" + ye + '\'' +
                        '}');
                break;
            }
        }

    }
}
