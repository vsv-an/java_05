import org.junit.Test;

import static org.junit.Assert.*;

public class SumArrayNewTest {

    @Test
    public void sumArray1() {
        int[] array = new int[] {0, 1, 2, 3, 4, 5};
        assertEquals(15, new SumArray().sumArray(array));
    }
    @Test
    public void sumArray2() {
        int[] array = new int[] {-7, -3};
        assertEquals(-10, new SumArray().sumArray(array));
    }
}