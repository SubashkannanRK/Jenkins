package Test.java.com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    App app = new App();

    @Test
    public void testAdd() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, app.subtract(3, 2));
    }

    @Test
    public void testAddWithNegativeNumbers() {
        assertEquals(-1, app.add(2, -3));
    }

    @Test
    public void testIsPositiveTrue() {
        assertTrue(app.isPositive(10));
    }

    @Test
    public void testIsPositiveFalse() {
        assertFalse(app.isPositive(-5));
    }
}
