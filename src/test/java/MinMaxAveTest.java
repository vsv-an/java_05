import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Part 2 Algorithms
8.	Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и
2 значения индексов. Алгоритм возвращает массив, который содержит
минимальное значение, максимальное значение,  и среднее среди всех значений
между 2-мя индексами.

Test Data:
({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
 */

class MinMaxAveTest {

    @Test
    void minMaxAve() {

        assertArrayEquals(new int[]{3, 7, 5}, new MinMaxAve().minMaxAve(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2, 6));
    }
}