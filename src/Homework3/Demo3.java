package Homework3;

import java.util.ArrayList;
/*
3.ArrayList
        1.	创建一个类型为ArrayList的集合对象，名为al
        2.	用集合对象al中记录1，2，3，4，5 这5个数字
        3.	请打印出集合对象al中第5个元素减去第1个元素的值的差
*/

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);
        objects.add(3);
        objects.add(4);
        objects.add(5);
        int a=(int)objects.get(4);
        int b=(int)objects.get(0);
        System.out.println(a-b);

    }
}
