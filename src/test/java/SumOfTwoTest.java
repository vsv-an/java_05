import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Part 2. Algorithms
14.	Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,
и число n. Алгоритм  возвращает пары элементов, которые в сумме дают число n.
Test Data:
({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
 */

class SumOfTwoTest {

    @Test
    void sumOfTwo() {
        int[] array = new int[]{4, 3, 7, 12, 4, 3, 5, 2, 9, 4, 12};
        int number = 12;

        int[][] expectedArray = new int[][]{{3, 9}, {7, 5}};

        assertArrayEquals(expectedArray, new SumOfTwo().sumOfTwo(array, number));
    }
    @Test
    void sumOfTwo2() {
        int[] array = new int[]{4, 3, 7, 12, 9, 5, 2, 9, 4, 12};
        int number = -1;

        int[][] expectedArray = new int[][]{};

        assertArrayEquals(expectedArray, new SumOfTwo().sumOfTwo(array, number));
    }
}