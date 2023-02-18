import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*
Part 2. Algorithms
12.	Написать алгоритм SortArray, который принимает на вход массив целых чисел,
и сортирует элементы массива в порядке возрастания.
Test Data:
{4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
 */
public class SortArrayTest {
    @Test
    public void sortArrayTest() {
        int[] array = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};

        int[] sortedArray = new int[]{2, 3, 4, 4, 5, 7, 9, 12, 12};

        assertArrayEquals(sortedArray, new SortArray().sortArray(array));
    }
}
