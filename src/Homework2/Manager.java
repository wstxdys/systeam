package Homework2;

public class Manager extends Employee {
    int bonus;
    public Manager(String name, int id, double pay ,int bonus) {
        super(name, id, pay);
        this.bonus=bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    void work() {
        System.out.println(name+"的工作是看着程序员写代码");
    }


    public String String() {
        return ("项目经理姓名是"+getName()+"工号是+"+getId()+"薪水是"+getPay()+"奖金是"+getBonus());
    }
}
