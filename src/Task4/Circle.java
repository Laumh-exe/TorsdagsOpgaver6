package Task4;

public class Circle implements Shape{

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        if (r < 0) {
            return 0;
        }
        return Math.PI * Math.pow(r, 2);
    }

    public double getR() {
        return r;
    }
}
