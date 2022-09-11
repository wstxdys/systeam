package Homework2;

public abstract class Employee {
    String name;
    int id;
    double pay;
    abstract void work();

    public Employee(String name, int id, double pay) {
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }


    public String String() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", pay=" + pay +
                '}';
    }
}
