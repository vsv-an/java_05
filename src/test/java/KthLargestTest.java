import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Part 2. Algorithms
13. Написать алгоритм KthLargest, который принимает на вход массив целых чисел
и число k, и возвращает k-тый максимальный элемент.
Test Data:
({4, 3, 7, 13, 5, 2, 9, 4, 12}, 3) → 9
 (13 и 12 - первый и второй самые большие элементы, а метод возвращает 9,
 как третий самый большой элемент)
 */

public class KthLargestTest {
    @Test
    public void kthLargestTest() {
        int[] array = new int[]{4, 3, 7, 13, 5, 2, 9, 4, 12};
        int k = 3;

        int expectedResult = 9;

        assertEquals(expectedResult, new KthLargest().kthLargest(array, k));
    }
}
