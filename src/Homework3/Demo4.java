package Homework3;

import java.util.ArrayList;
import java.util.Random;
/*
.创建猫类，猪类
        循环生成10个对象放入队列中,根据随机数为0表示放入一只猫，1为放入一头猎;
        采用Iterator循环显示每个对象的信息,并统计出10个对象中有多少猫，多少头猪
*/
public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        Random random = new Random();
        int counter=0;
        for (int i = 0; i <10 ; i++) {
            int i1 = random.nextInt(2);
            if (i1==0){
                objects.add(new Cat1());
                counter++;
            }else {
                objects.add(new Zhu());
            }
        }
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i)+" ");
        }
        System.out.println("猫有"+counter+"只，猪有"+(10-counter)+"只");
    }
}
