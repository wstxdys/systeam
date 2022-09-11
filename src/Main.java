public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("苹果","青色","酸酸的");
        String s = fruit.GetMsg();
        System.out.println(s);
        ZhaFruit zhaFruit = new ZhaFruit();
        String s1 = zhaFruit.GetFruitzhi(fruit);
        System.out.println(s1);
    }
}

