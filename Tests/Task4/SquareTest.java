package Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square sq1;
    Square sq2;
    Square sq3;
    Square sq4;
    @BeforeEach
    void setUp() {
        sq1 = new Square(2);
        sq2 = new Square(10);
        sq3 = new Square(0);
        sq4 = new Square(-1);
    }

    @Test
    void getArea2() {
        assertEquals(sq1.getL()*sq1.getL(), sq1.getArea());
    }
    @Test
    void getArea10() {
        assertEquals(sq2.getL()*sq2.getL(), sq2.getArea());
    }
    @Test
    void getArea0() {
        assertEquals(0, sq3.getArea());
    }
    @Test
    void getAreaNegative() {
        assertEquals(0, sq4.getArea());
    }

}