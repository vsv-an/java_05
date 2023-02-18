import java.util.Arrays;

/*
Part 2 Algorithms
10.	Написать алгоритм PeakElement,  который принимает на вход массив
целых чисел и возвращает значения пиковых элементов
(элементы, которые больше своих соседей).
Test Data:
{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
 */
public class PeakElement {
    public int[] peakElement(int[] array) {
        if (array != null && array.length > 0) {
            int count = 0;
            if (array[0] > array[1]) {
                count = count + 1;
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                count = count + 1;
            }
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    count++;
                }
            }

            int[] arr = new int[count];

            if (array[0] > array[1]) {
                arr[0] = array[0];
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                arr[arr.length - 1] = array[array.length - 1];
            }
            for (int i = 1, j = 1; i < array.length - 1; i++) {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    arr[j] = array[i];
                    j++;
                }
            }

            return arr;
        }

        return new int[0];
    }
}
