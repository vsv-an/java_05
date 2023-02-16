import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManipulationsWithArraysNewTest {
    @Test
    public void multiplyArrayByNumberHappyPath() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedResult = new int[]{3, 6, 9, 12, 15};

        assertArrayEquals(expectedResult, new ManipulationsWithArrays().multiplyArrayByNumber(array, number));
    }
    @Test
    public void toDoubleArrayHappyPath() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        double[] expectedResult = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};

        assertArrayEquals(expectedResult, new ManipulationsWithArrays().toDoubleArray(array));
    }
    @Test
    public void toIntArrayHappyPath() {
        double[] array = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

        assertArrayEquals(expectedResult, new ManipulationsWithArrays().toIntArray(array));
    }
    @Test
    public void toStringArrayFromIntArrayHappyPath() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        String[] expectedResult = new String[]{"1", "2", "3", "4", "5"};

        assertArrayEquals(expectedResult, new ManipulationsWithArrays().toStringArray(array));
    }
    @Test
    public void toStringArrayFromDoubleArrayHappyPath() {
        double[] array = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = new String[]{"1.1", "2.5", "3.7", "4.0", "5.5"};

        assertArrayEquals(expectedResult, new ManipulationsWithArrays().toStringArray(array));
    }
    @Test
    public void areValuesGreaterThanNumberValidArrayValidNumber() {
        int[] array = {6, 7, 8, 9, 10};
        int number = 5;

        assertEquals(true, new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number));
    }
    @Test
    public void areValuesGreaterThanNumberValidArrayValidNumberEqualArraysNumber() {
        int[] array = {6, 7, 8, 9, 10};
        int number = 6;

        assertEquals(false, new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number));
    }
    @Test
    public void areValuesGreaterThanNumberValidArrayValidNumberLessThemArraysNumber() {
        int[] array = {6, 7, 8, 9, 10};
        int number = 11;

        assertEquals(false, new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number));
    }
    @Test
    public void areValuesGreaterThanNumberValidArrayValidNumberIsMaxValuePlusOne() {
        int[] array = {6, 7, 8, 9, 10};
        int number = Integer.MAX_VALUE + 1;

        assertEquals(true, new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number));
    }
    @Test
    public void areValuesGreaterThanNumberWhereArrayIsNull() {
        int[] array = null;
        int number = 5;

        assertEquals(false, new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number));
    }

    // Part 2.1 Arrays
    // 4. В классе ManipulationsWithArrays написать метод getTheGreaterHalf(),
    // который принимает массив целых чисел,  и возвращает  массив из суммарно
    // бОльшей первой или второй половины входящего массива

    @Test
    public void getTheGrearHalfHappyPath() {
        int[] array = {6, 7, 8, 9, 10, 11};
        int[] expectedResult = {9, 10, 11};

        assertArrayEquals(expectedResult, new ManipulationsWithArrays().getTheGreaterHalf(array));
    }
}