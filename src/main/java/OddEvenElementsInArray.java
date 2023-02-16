import java.util.Arrays;

public class OddEvenElementsInArray {
    // 2. В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
    // который принимает на вход массив целых чисел и возвращает массив int[2],
    // который содержит количество четных и нечетных элементов входящего массива

    public int[] countOddEvenValuesInArray(int[] array) {
        if (array != null && array.length > 0) {
            int evenCount = 0;
            int oddCount = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            int[] arr = new int[]{evenCount, oddCount};

            return arr;
        }

        return new int[0];
    }

    // 3. В классе OddEvenElementsInArray написать метод createOddEvenArray(),
    // который принимает массив целых случайных чисел, и возвращает
    // двумерный массив (массив четных и массив нечетных чисел)

    public int[][] createOddEvenArray(int[] array) {
        if (array != null && array.length > 0) {
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
            return arr;
        }

        return new int[0][0];
    }

    public int[][] createOddEvenArrayRandom(int[] array) {
        if (array != null && array.length > 0) {
            int[] arrayRandom = new int[10];
            for (int i = 0; i < arrayRandom.length; i++) {
                arrayRandom[i] = (int)(Math.random() * 100) + 1;
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
            return arr;
        }

        return new int[0][0];
    }
}
