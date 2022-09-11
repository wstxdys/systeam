package Homework2;

import java.util.Random;

public class AnimalTest {
    public static void main(String[] args) {
        String[] oop=new  String[5];
        Random random = new Random();


        for (int j = 0; j <oop.length; j++) {
            int i = random.nextInt(3);
            if (i==0){
                Cat cat = new Cat("猫");
                oop[j]=cat.kind;
                cat.cru();
            }
            if (i==1){
                Dog dog = new Dog("狗");
                oop[j]=dog.kind;
                dog.cru();
            }
            if (i==2){
                Sheep sheep = new Sheep("羊");
                oop[j]=sheep.kind;
                sheep.cru();
            }

        }
        for (int i = 0; i <oop.length ; i++) {
            System.out.println(oop[i]);

        }

    }

}
