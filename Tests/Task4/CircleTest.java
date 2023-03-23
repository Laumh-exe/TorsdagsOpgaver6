package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle c1;
    Circle c2;
    Circle c3;
    Circle c4;
    @BeforeEach
    void setUp() {
        c1 = new Circle(2);
        c2 = new Circle(-2);
        c3 = new Circle(10);
        c4 = new Circle(0);
    }

    @Test
    void getArea2() {
        assertEquals(Math.PI * c1.getR() * c1.getR(), c1.getArea());
    }

    @Test
    void getAreaNegative2() {
        assertEquals(0, c2.getArea());
    }
    @Test
    void getArea10() {
        assertEquals(Math.PI * c3.getR() * c3.getR(), c3.getArea());
    }
    @Test
    void getArea0() {
        assertEquals(0, c4.getArea());
    }
}