package Homework2;

public class Dog extends Animal {
    public Dog(String kind) {
        super(kind);
    }

    @Override
    void cru() {
        System.out.println( kind+"的叫声实：汪汪汪");
    }
}
