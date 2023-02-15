import org.junit.Test;

import static org.junit.Assert.*;

public class IsPositiveNumberNewTest {
    @Test
    public void isPositiveNumberTestHappyPath() {
        int number = 555;
        assertEquals(true, new IsPositiveNumber().isPositiveNumber(number));
    }
    @Test
    public void isZeroNumberTestHappyPath() {
        int number = 0;
        assertEquals(true, new IsPositiveNumber().isPositiveNumber(number));
    }
    @Test
    public void isNegativeNumberTestHappyPath() {
        int number = -555;
        assertEquals(false, new IsPositiveNumber().isPositiveNumber(number));
    }
}
