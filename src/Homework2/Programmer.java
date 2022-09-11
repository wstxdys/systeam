package Homework2;

public class Programmer  extends Employee{
    public Programmer(String name, int id, double pay) {
        super(name, id, pay);
    }



    @Override
    void work() {
        System.out.println(name+"的工作是写代码");

    }

    public String String() {
        return ("程序员姓名是"+getName()+"工号是+"+getId()+"薪水是"+getPay());
    }





}
