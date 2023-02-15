import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManipulationsWithArraysNewTest {
    @Test
    public void multiplyArrayByNumberHappyPath() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedResult = new int[]{3, 6, 9, 12, 15};

        assertArrayEquals(expectedResult, new ManipulationsWithArraysNew().multiplyArrayByNumber(array, number));
    }
    @Test
    public void toDoubleArrayHappyPath() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        double[] expectedResult = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};

        assertArrayEquals(expectedResult, new ManipulationsWithArraysNew().toDoubleArray(array));
    }
    @Test
    public void toIntArrayHappyPath() {
        double[] array = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

        assertArrayEquals(expectedResult, new ManipulationsWithArraysNew().toIntArray(array));
    }
    @Test
    public void toStringArrayFromIntArrayHappyPath() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        String[] expectedResult = new String[]{"1", "2", "3", "4", "5"};

        assertArrayEquals(expectedResult, new ManipulationsWithArraysNew().toStringArray(array));
    }
    @Test
    public void toStringArrayFromDoubleArrayHappyPath() {
        double[] array = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = new String[]{"1.1", "2.5", "3.7", "4.0", "5.5"};

        assertArrayEquals(expectedResult, new ManipulationsWithArraysNew().toStringArray(array));
    }
}