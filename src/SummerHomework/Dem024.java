package SummerHomework;

public class Dem024 {
    /*任务24：创建5个学生对象，并赋给一个学生数组，每个学生有以下属性：学号、姓名、年龄，请按顺序实现以下任务：
子任务1：将学生按学号排序输出。
子任务2：给所有学生年龄加1。
子任务3：在实现子任务2的基础上，统计大于20岁的学生人数。*/
    public static void main(String[] args) {
        Student student = new Student("张三",15,1);
        Student student1 = new Student("张1",19,4);
        Student student2 = new Student("张2",20,3);
        Student student3 = new Student("张4",17,8);
        Student student4 = new Student("张5",18,5);
        Student[] students={student,student1,student2,student3,student4};
        Student student5 = new Student();
        student5=students[0];
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j <i ; j++) {
                if (students[j].card>students[j+1].card){
                    student5=students[j];
                    students[j]=students[j+1];
                    students[j+1]=student5;
                }
            }
            students[i].age+=1;
        }
        int counter =0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].age>=20){
                counter++;
            }
            System.out.println(students[i]);
        }
        System.out.println("超过20岁的人有"+counter);
    }
}
