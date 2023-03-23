package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeBuilderTest {

    ShapeBuilder shapeBuilder;
    Square sq1;
    Square sq2;
    Square sq3;
    Square sq4;
    Circle c1;
    Circle c2;
    Circle c3;
    Circle c4;

    @BeforeEach
    void setUp() {
        shapeBuilder = new ShapeBuilder();

        sq1 = new Square(10);
        sq2 = new Square(5);
        sq3 = new Square(0);
        sq4 = new Square(-5);

        c1 = new Circle(10);
        c2 = new Circle(5);
        c3 = new Circle(0);
        c4 = new Circle(-5);
    }

    @Test
    void getTotalAreaPositiveSq() {
        shapeBuilder.addShape(sq1);
        shapeBuilder.addShape(sq2);

        assertEquals(sq1.getArea()+ sq2.getArea(), shapeBuilder.getTotalArea());
    }
    @Test
    void getTotalAreaMixSq() {
        shapeBuilder.addShape(sq1);
        shapeBuilder.addShape(sq2);
        shapeBuilder.addShape(sq3);
        shapeBuilder.addShape(sq4);

        assertEquals(sq1.getArea()+ sq2.getArea() + sq3.getArea() + sq4.getArea(), shapeBuilder.getTotalArea());
    }
    @Test
    void getTotalAreaPositiveCircles() {
        shapeBuilder.addShape(c1);
        shapeBuilder.addShape(c2);

        assertEquals(c1.getArea()+ c2.getArea(), shapeBuilder.getTotalArea());
    }
    @Test
    void getTotalAreaMixCircles() {
        shapeBuilder.addShape(c1);
        shapeBuilder.addShape(c2);
        shapeBuilder.addShape(c3);
        shapeBuilder.addShape(c4);

        assertEquals(c1.getArea() + c2.getArea() + c3.getArea() + c4.getArea(), shapeBuilder.getTotalArea());
    }
    @Test
    void getTotalAreaPositiveMix() {
        shapeBuilder.addShape(c1);
        shapeBuilder.addShape(c2);
        shapeBuilder.addShape(sq1);
        shapeBuilder.addShape(sq2);

        assertEquals(c1.getArea() + c2.getArea() + sq1.getArea()+ sq2.getArea(), shapeBuilder.getTotalArea());

    }
    @Test
    void getTotalAreaMixMix() {
        shapeBuilder.addShape(c1);
        shapeBuilder.addShape(c2);
        shapeBuilder.addShape(c3);
        shapeBuilder.addShape(c4);
        shapeBuilder.addShape(sq1);
        shapeBuilder.addShape(sq2);
        shapeBuilder.addShape(sq3);
        shapeBuilder.addShape(sq4);

        assertEquals(c1.getArea() + c2.getArea() + c3.getArea() + c4.getArea() + sq1.getArea()+ sq2.getArea() + sq3.getArea() + sq4.getArea(), shapeBuilder.getTotalArea());
    }


}