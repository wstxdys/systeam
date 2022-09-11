package SummerHomework;

public class Demo12 {
    /*任务12：动物园饲养的食肉动物分大型动物和小型动物两类，规定老虎、狮子一类的大动物每次喂肉每头三斤
    ，狐狸、山猫一类小动物每三头喂一斤．该动物园共有这两类动物100头，每次需喂肉100斤，编程输出大、小动物的数量。
要求：用循环语句实现*/
    public static void main(String[] args) {

        for (int i = 0; i <100 ; i++) {
            if (3*i+((100-i)/3)*1==100){
                System.out.println("大型动物有"+i+"只，小型动物有 " +(100-i)+"只");
            }

        }
    }
}
