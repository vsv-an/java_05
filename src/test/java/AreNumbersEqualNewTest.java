import org.junit.Test;

import static org.junit.Assert.*;


public class AreNumbersEqualNewTest {
    @Test
    public void areNumbersEqualHappyPath() {
        int x = 89;
        int y = 89;

        assertEquals(0, new AreNumbersEqual().areNumbersEqual(x, y));
    }
    @Test
    public void areNumbersXLessYHappyPath() {
        int x = -89;
        int y = 89;

        assertEquals(-1, new AreNumbersEqual().areNumbersEqual(x, y));
    }
    @Test
    public void areNumbersNotXMoreYHappyPath2() {
        int x = 89;
        int y = -89;

        assertEquals(1, new AreNumbersEqual().areNumbersEqual(x, y));
    }
}
