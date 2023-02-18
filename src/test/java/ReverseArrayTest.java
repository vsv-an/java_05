import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*
Part 2 Algorithms
11.	 Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
Test Data:
{2, 7, 3, 10} → {10, 3, 7, 2}
 */

public class ReverseArrayTest {
    @Test
    public void reverseArrayTest1() {
        int[] array = new int[]{2, 7, 3, 10};

        int[] expectedResult = new int[]{10, 3, 7, 2};

        assertArrayEquals(expectedResult, new ReverseArray().reverseArray(array));
    }

    @Test
    public void reverseArrayTest2() {
        int[] array = new int[]{2, 7, 3, 10, 5};

        int[] expectedResult = new int[]{5, 10, 3, 7, 2};

        assertArrayEquals(expectedResult, new ReverseArray().reverseArray(array));
    }
}
