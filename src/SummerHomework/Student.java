package SummerHomework;

public class Student {
    String name;
    int age; int card;

    public Student(String name, int age, int card) {
        this.name = name;
        this.age = age;
        this.card = card;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", card=" + card +
                '}';
    }
}
