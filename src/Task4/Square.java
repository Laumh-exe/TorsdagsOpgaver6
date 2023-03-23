package Task4;

public class Square implements Shape {

    private double l;

    public Square(double l) {
        this.l = l;
    }

    @Override
    public double getArea() {
        if (l < 0) {
            return 0;
        }
        return l*l;
    }

    public double getL() {
        return l;
    }
}
