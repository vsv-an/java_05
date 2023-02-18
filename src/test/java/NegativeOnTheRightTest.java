import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Part 2. Algorithms
13. Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает массив,  в котором все негативные числа находятся во второй половине массива (массив не должен быть отсортирован)
Test Data:
{4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
 */

public class NegativeOnTheRightTest {
    @Test
    public void negativeOnTheRightTest() {
        int[] array = new int[]{4, -3, 7, -12, 5, -2, 9, 4, 12};

        int[] expectedArray = new int[] {4, 7, 5, 9, 4, 12, -3, -12, -2};

        assertArrayEquals(expectedArray, new NegativeOnTheRight().negativeOnTheRight(array));
    }

}
