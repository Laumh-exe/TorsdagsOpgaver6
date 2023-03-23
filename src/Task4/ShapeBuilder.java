package Task4;

import java.util.ArrayList;

public class ShapeBuilder {

    ArrayList<Shape> shapes;

    public ShapeBuilder() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    double getTotalArea() {
        double total = 0;
        for(Shape s:shapes) {
            total += s.getArea();
        }
        return total;
    }
}
