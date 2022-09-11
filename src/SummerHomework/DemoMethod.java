package SummerHomework;

public class DemoMethod {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,3);
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2,4);
        Shape[] arr={triangle,circle,rectangle};
        for (int i = 0; i < arr.length; i++) {
            arr[i].calarea();
        }
    }
}
