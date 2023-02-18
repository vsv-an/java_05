import java.util.Arrays;

/*
Part 2. Algorithms
12.	Написать алгоритм SortArray, который принимает на вход массив целых чисел,
и сортирует элементы массива в порядке возрастания.
Test Data:
{4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
 */
public class SortArray {
    public int[] sortArray(int[] array) {
        if (array != null && array.length >0) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

            System.out.println(Arrays.toString(array));
            return array;
        }

        return new int[0];
    }
}
