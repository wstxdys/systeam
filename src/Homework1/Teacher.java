package Homework1;

public class Teacher {
    int id;
    String name;
    String sex;
    int age;
    double height;

    public Teacher(int id, String name, String sex, int age, double height) {
        this.id = id;
        if (name.length()<4&&name.length()>1){
            this.name = name;
        }else {
            System.out.println("名字错误");
        }
      if (sex=="男"||sex=="女"){
          this.sex = sex;
      }else{
          System.out.println("错误");
      }
        if (age>=20&&age<=55){
            this.age = age;
        }else{
            System.out.println("年龄错误");
        }
       if (height>1.50&&height<1.80){
           this.height = height;
       }else {
           System.out.println("错误");
       }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    void ShowDta(){
        System.out.println("老师姓名为" +
                "" + name +
                " 编号为" + id + '\'' +
                "性别为" + sex + '\'' +
                "年龄为" + age +
                "身高为" + height 
                );
    }
}
