package Homewwork4;

public class Student {
    int car;
    String name;
    char sex;
    double results;

    public Student() {
    }

    public Student(int car, String name, char sex, double results) {
        this.car = car;
        this.name = name;
        if (sex=='男'||sex=='女'){
            this.sex = sex;
        }else{
            System.out.println("输入错误");
        }

        this.results = results;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
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
        if (sex=='男'||sex=='女'){
            this.sex = sex;}

    }

    public double getResults() {
        return results;
    }

    public void setResults(double results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Student{" +
                "car=" + car +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", results=" + results +
                '}';
    }
}
