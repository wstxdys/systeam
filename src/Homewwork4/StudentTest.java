package Homewwork4;

import java.util.ArrayList;
import java.util.Scanner;
/*2、写一个学生的类，类中有属性：编号（int），姓名(String)，性别
(char只能是‘男’或‘女’)
，考试成绩(double)。类中有所有属性的getXXX与setXXX方法。
默认的构造方法(不带参)，及能初始化所有属性的构造方法(带四个参数)。
再写一个测试类，main中生成一个ArrayList类的对象，用此对象放入多个学生对象。
要求：使用循环输入学生的编号，输入学生的姓名，输入学生的性别，输入学生的成绩，
然后生成一个学生对象，放入到集合对象中去。然后问是否还要继续输入学生信息，
如果回答是‘y’这个字符，那么就再输入一个学生的信息，否则结束循环。
最后输出所有学生的信息。*/
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入学生编号");
            int i = sc.nextInt();
            System.out.println("请输入学生姓名");
            String next = sc.next();
            System.out.println("请输入学生成绩");
            double v = sc.nextDouble();
            System.out.println("请输入学生性别");
            String next1 = sc.next();
            char a=  next1.charAt(0);
            System.out.println(a);
            objects.add(new Student(i,next,a,v));
            System.out.println("是否还要录入学生信息");
            String i1 = sc.next();
            if (i1=="y"){
                System.out.println("请输入学生编号");
                int Q = sc.nextInt();
                System.out.println("请输入学生姓名");
                String W = sc.next();
                System.out.println("请输入学生成绩");
                double E = sc.nextDouble();
                System.out.println("请输入学生性别");
                String R = sc.next();
                char A=  next.charAt(0);
                objects.add(new Student(Q,W,A,E));
            }else {
                break;
            }
        }
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i));
        }
    }
}
