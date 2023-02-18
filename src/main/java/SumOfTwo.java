import java.util.Arrays;
/*
Part 2. Algorithms
14.	Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,
и число n. Алгоритм  возвращает пары элементов, которые в сумме дают число n.
Test Data:
({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
 */

public class SumOfTwo {
    public int[][] sumOfTwo(int[] array, int number) {
        if (array != null && array.length > 0) {
            int n = array.length;
            for (int i = 0, m = 0; i != n; i++, n = m) {
                for (int j = m = i + 1; j != n; j++) {
                    if (array[j] != array[i]) {
                        if ( m !=j) {
                            array[m] = array[j];
                        }
                            m++;
                     }
                }
            }
            if (n != array.length) {
                int[] b = new int[n];
                for (int i = 0; i < n; i++) {
                    b[i] = array[i];
                }

                array = b;
            }

            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (i != j && (array[i] + array[j] == number)) {
                        counter++;
                    }
                }
            }

            int[][] arr = new int[counter][2];

            for (int i = 0, k = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (i != j && array[i] + array[j] == number) {
                        arr[k] = new int[]{array[i], array[j]};
//                        arr[k][0] = array2[i];
//                        arr[k][1] = array2[j];
                        k++;
                    }
                }
            }

            System.out.println(Arrays.deepToString(arr));
            System.out.println(Arrays.toString(array));
            return arr;
        }

        return new int[0][0];
    }
}
