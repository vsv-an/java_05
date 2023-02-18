import java.util.Arrays;

/*
Part 2. Algorithms
13. Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает массив,  в котором все негативные числа находятся во второй половине массива (массив не должен быть отсортирован)
Test Data:
{4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
 */

public class NegativeOnTheRight {
    public int[] negativeOnTheRight(int[] array) {
        if (array != null && array.length > 0) {
            int[] arr = new int[array.length];
            int count = 0;
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    count++;
                }
                if (array[i] > 0) {
                    arr[j] = array[i];
                    j++;
                }
            }
            for (int i = 0, j = count; i < array.length; i++) {
                if (array[i] < 0) {
                    arr[j] = array[i];
                    j++;
                }
            }

            System.out.println(count);
            System.out.println(Arrays.toString(arr));
            return arr;
        }

        return new int[0];
    }
}

