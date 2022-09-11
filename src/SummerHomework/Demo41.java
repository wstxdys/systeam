package SummerHomework;

public class Demo41 {
    /*任务41：一个人很倒霉，不小心打碎了一位妇女的一篮子鸡蛋。为了赔偿便询问篮子里有多少鸡蛋。那妇女说，
    她也不清楚，只记得每次拿两个则剩一个，每次拿3个则剩2个，每次拿5个则剩4个，若每个鸡蛋1元，请你帮忙编程，计算最少应赔多少钱？
要求：用循环语句实现，直接打印出结果不给分。*/
    public static void main(String[] args) {
        int a=1;
        while (true){
            a++;
            if (a%3==2&&a%5==4){
                System.out.println(a);
                break;
            }
        }
    }
}
