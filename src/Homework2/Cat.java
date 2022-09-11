package Homework2;

public class Cat extends Animal {
    public Cat(String kind) {
        super(kind);
    }

    @Override
    void cru() {

        System.out.println( kind+"的叫声实：喵喵喵");
    }
}
