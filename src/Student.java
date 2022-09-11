public class Student {
  private   String name;
  private  char sex;
  private  int age;
  private String dir;

    public Student() {
    }

    public Student(String name, char sex, int age, String dir) {

        if (name.length()<4){
            this.name = name;
        }else {
            System.out.println("名字错误");
        }
        if (sex=='男'||sex=='女'){
            this.sex = sex;
        }else {
            System.out.println("性别错误");
        }
        if (age>=1||age<=60){
            this.age = age;
        }else {
            System.out.println("年龄错误");
        }
     if (dir=="java"||dir==".net"){
         this.dir = dir;
     }else{
         System.out.println("学习方向错误");
     }



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", dir='" + dir + '\'' +
                '}';
    }
}
