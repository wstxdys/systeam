package Homewwork4;

import java.util.Objects;

public class Cat1 {
    String name;
    int age;

    public Cat1() {
    }

    public Cat1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void SayHy(){
        System.out.println("我是名叫"+this.name+"的，猫，年龄"+this.age+"岁");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat1 cat1 = (Cat1) o;
        return age == cat1.age &&
                Objects.equals(name, cat1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
