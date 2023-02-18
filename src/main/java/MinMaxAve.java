import java.util.Arrays;

/*
Part 2 Algorithms
8.	Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и
2 значения индексов. Алгоритм возвращает массив, который содержит
минимальное значение, максимальное значение,  и среднее среди всех значений
между 2-мя индексами.

Test Data:
({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
 */
public class MinMaxAve {
    public int[] minMaxAve(int[] array, int a, int b) {
        if (array != null && array.length > 0) {

            return new int[]{array[a], array[b], (int)((array[a] + array[b]) / 2)};
        }

        return new int[0];
    }
}
