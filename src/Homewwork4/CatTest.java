package Homewwork4;

import java.util.ArrayList;/*3.ArrayList
1. 创建一个猫类，名为Cat，为其定义名字和年龄字段，分别定义构造方法和属性，为其
定义一个名为SayHy的方法，实现自我介绍的行为（答应我是**的猫，年龄**岁）
2. 在Main中创建一个ArrayList的集合对象al
3. 在Main中创建3只猫对象cat1(“小黑猫”，1),cat2（”小白猫”,2）,cat3(“小花猫”,3)
4. 用集合对象al添加上述3只猫对象,
5.  并循环调用每只猫的SayHy方法
6.  删除一只小花猫。*/

public class CatTest {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        Cat1 cat = new Cat1("小黑",1);
        Cat1 cat1 = new Cat1("小白",3);
        Cat1 cat2 = new Cat1("小花",2);
        objects.add(cat);
        objects.add(cat1);
        objects.add(cat2);
        for (int i = 0; i < objects.size(); i++) {

            Cat1 cat4 =  (Cat1)(objects.get(i));
            cat4.SayHy();
        }
        boolean remove = objects.remove(cat1);
    }
}
