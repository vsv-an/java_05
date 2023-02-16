import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenElementsInArrayTest {

    // 2. В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
    // который принимает на вход массив целых чисел и возвращает массив int[2],
    // который содержит количество четных и нечетных элементов входящего массива

    @Test
    void countOddEvenValuesInArray() {

            int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            int[] expectedResult = new int[] {5, 5};

            assertArrayEquals(expectedResult, new OddEvenElementsInArray().countOddEvenValuesInArray(array));
    }

    // 3. В классе OddEvenElementsInArray написать метод createOddEvenArray(),
    // который принимает массив целых случайных чисел, и возвращает
    // двумерный массив (массив четных и массив нечетных чисел)

    @Test
    void createOddEvenArray() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[][] expectedResult = new int[][] {{2, 4, 6, 8, 0}, {1, 3, 5, 7, 9}};

        assertArrayEquals(expectedResult, new OddEvenElementsInArray().createOddEvenArray(array));
    }
    @Test
    void createOddEvenArrayRandom() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int[][] arr = new int[2][];
        arr[0] = new int[evenCount];
        arr[1] = new int[oddCount];
        for (int i = 0, j = 0, k = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arr[0][j] = array[i];
                j++;
            } else {
                arr[1][k] = array[i];
                k++;
            }
        }

        System.out.println(Arrays.deepToString(arr));
        assertArrayEquals(arr, new OddEvenElementsInArray().createOddEvenArray(array));
    }
}
