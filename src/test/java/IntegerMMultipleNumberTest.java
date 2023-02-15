import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerMMultipleNumberTest {
    @Test
    public void integerMisZeroNumber() {
        int m = 0;
        assertEquals("Zero is always multiple of every number", new IntegerMMultipleNumber().integerMMultipleNumber(m));
    }
    @Test
    public void integerMMultipleNineAndNineNumber() {
        int m = 63;
        assertEquals("Good Number", new IntegerMMultipleNumber().integerMMultipleNumber(m));
    }
    @Test
    public void integerMMultipleNineandNotMultipleSevenNumber() {
        int m = 81;
        assertEquals("Bad Number", new IntegerMMultipleNumber().integerMMultipleNumber(m));
    }
    @Test
    public void integerMMultipleElevenAndNotMultipleSevenAndNineNumber() {
        int m = 121;
        assertEquals("Poor Number", new IntegerMMultipleNumber().integerMMultipleNumber(m));
    }
    @Test
    public void integerMNotMultipleElevenAndSevenAndNineNumber() {
        int m = 10;
        assertEquals("-1", new IntegerMMultipleNumber().integerMMultipleNumber(m));
    }
}