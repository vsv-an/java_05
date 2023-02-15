import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenValuesInArrayNewTest {

    @Test
    void countEvenValuesInArray() {
        int[] array = new int[] {0, 1, 5, 4, 5, 6, 8};

        assertEquals(4, new OddEvenValuesInArray().countEvenValuesInArray(array));
    }
    @Test
    void countOddValuesInArray() {
        int[] array = new int[] {0, 1, 5, 4, 5, 6, 8};

        assertEquals(3, new OddEvenValuesInArray().countOddValuesInArray(array));
    }
}