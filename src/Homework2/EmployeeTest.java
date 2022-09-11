package Homework2;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("张三",2988,21222,1232);
        manager.work();
        String string = manager.String();
        System.out.println(string);
        Programmer programmer = new Programmer("李四",1232,13456);
        programmer.work();
        String string1 = programmer.String();
        System.out.println(string1);

    }
}
