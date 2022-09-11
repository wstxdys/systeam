package SummerHomework;

public class Circle  extends Shape{
   int n;

    public Circle(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "n=" + n +
                '}';
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    void calarea() {
        double pai=3.14;
   double s;
   s=2*pai*n*n;
        System.out.println("圆形d面积是"+s);
    }
}
