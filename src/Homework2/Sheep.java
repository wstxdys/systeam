package Homework2;

public class Sheep extends Animal {
    public Sheep(String kind) {
        super(kind);
    }

    @Override
    void cru() {
        System.out.println( kind+"的叫声实：咩咩咩");
    }
}
