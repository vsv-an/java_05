import org.junit.Test;

import static org.junit.Assert.*;

public class BiggerValue_newTest {
    @Test
    public void biggerValueTestHappyPath1() {
        int a = 3333;
        int b = 9999;

        assertEquals(9999, new BiggerValue().biggerValue(a, b));
    }
    @Test
    public void biggerValueTestHappyPath2() {
        int a = 777;
        int b = 333;

        assertEquals(777, new BiggerValue().biggerValue(a, b));
    }
    @Test
    public void biggerValueTestHappyPath3() {
        int a = 88888;
        int b = 88888;

        assertEquals(0, new BiggerValue().biggerValue(a, b));
    }

}