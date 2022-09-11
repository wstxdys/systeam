package Homework3;

//1.使用ArrayList集合，向集合中插入Dog对象（属性：name age），三个，删除其中一个,判断是否包含对象（“小黑”,1）.

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Object> a = new ArrayList<>();
        boolean add = a.add(new Dog("小黑",1));
        boolean add1 = a.add(new Dog("小孩", 11));
        boolean add2 = a.add(new Dog("小陈", 13));



        boolean remove = a.remove(new Dog("小孩",11));
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));

        }
    }
}
