
/*
Part 2. Algorithms
13. Написать алгоритм KthLargest, который принимает на вход массив целых чисел
и число k, и возвращает k-тый максимальный элемент.
Test Data:
({4, 3, 7, 13, 5, 2, 9, 4, 12}, 3) → 9
 (13 и 12 - первый и второй самые большие элементы, а метод возвращает 9,
 как третий самый большой элемент)
 */
public class KthLargest {
    public int kthLargest(int[] array, int k) {
        if (array != null && array.length > 0) {
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

            return array[array.length - k];
        }

        return -1;
    }
}
