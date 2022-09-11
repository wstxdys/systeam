package Homewwork4;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    /*、使用ArrayList类生成一个集合对象，向此集合对象中加入“一只狗对象”，“一只猫对象”，
一个整数包装对象1，一个小数包装对象5.8，再加入一个“人对象”。
然后循环输出这些对象的值。(不要用泛型)
*/
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add( new Cat("猫",11));
        objects.add(new Dog("狗",12));
        objects.add(new Integer(1));
        objects.add(new Double(5.8));
        objects.add(new People("王五",11));
        Iterator<Object> iterator = objects.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
