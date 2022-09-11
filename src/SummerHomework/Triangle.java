package SummerHomework;

public class Triangle extends Shape {
    int n;
    int m;

    public Triangle(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "n=" + n +
                ", m=" + m +
                '}';
    }

    @Override
    void calarea() {
        int s;
        s=n*m/2;
        System.out.println("三角形面积是"+s);
    }
}
