import java.util.Arrays;

/*
Part 2 Algorithms
11.	 Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
Test Data:
{2, 7, 3, 10} → {10, 3, 7, 2}
 */
public class ReverseArray {
    public int[] reverseArray(int[] array) {
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }

            System.out.println(Arrays.toString(array));
            return array;
        }

        return new int[0];
    }
}
