package Homewwork4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Classmate {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Student(01,"小王",'男',77));
        objects.add(new Student(02,"小黑",'男',79));
        objects.add(new Student(03,"小红",'女',88));
        objects.add(new Student(04,"小吴",'男',70));
        ArrayList<Object> objects1 = new ArrayList<>();
        objects.add(new Student(11,"小被",'男',70));
        objects.add(new Student(21,"小a",'男',70));
        objects.add(new Student(31,"小锕",'男',60));
        objects.add(new Student(41,"小才",'男',90));
        objects.addAll(objects1);
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i));
        }

    }
}
