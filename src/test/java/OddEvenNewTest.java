import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenNewTest {
    OddEven OddEven = new OddEven();

    @Test
    public void oddEven1() {
        assertEquals("Odd", OddEven.oddEven(-345));
    }
    @Test
    public void oddEven2() {
        assertEquals("Even", OddEven.oddEven(0));
    }
    @Test
    public void oddEven3() {
        assertEquals("Even", OddEven.oddEven(222222));
    }
}