package Homework3;

import java.util.Objects;

public  class Cat {
    String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

     void show(){
         System.out.println("姓名是"+name);
     };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
