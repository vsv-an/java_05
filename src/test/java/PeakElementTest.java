import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*
Part 2 Algorithms
10.	Написать алгоритм PeakElement,  который принимает на вход массив
целых чисел и возвращает значения пиковых элементов
(элементы, которые больше своих соседей).
Test Data:
{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
 */

public class PeakElementTest {
    @Test
    public void peakElementTest() {
        int[] array = new int[]{3, 2, 7, 5, 1, 9, 23, 1};

        int[] expectedResult = new int[]{3, 7, 23};

        assertArrayEquals(expectedResult, new PeakElement().peakElement(array));
    }
}
