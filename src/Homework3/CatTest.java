package Homework3;

import java.util.ArrayList;
/*2.创建一个类Cat
        包含属性name，在构造方法中进行初始化
        添加一个方法show()，用以打印name属性的值
        创建一个类CatTest，添加main方法，实现
        创建一个ArrayList，向其中添加三个Cat对象
        遍历该集合，获取集合中对象的个数，并且对每个Cat对象调用show()方法*/
public class CatTest {
    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();

       objects.add(new Cat("张三"));
        objects.add(new Cat("李四"));
        objects.add(new Cat("王五"));
        for (int i = 0; i < objects.size(); i++) {
            Cat cat = (Cat)(objects.get(i));
          cat.show();
        }
        System.out.println(objects.size());

    }
}
