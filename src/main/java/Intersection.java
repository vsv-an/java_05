
/*
Part 2 Algorithms
9. Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
и возвращает массив общих элементов.

Test Data:
{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
{1, 2, 4, 5, 89}, {8, 9, 45} → {}
 */
public class Intersection {
    public int[] intersection(int[] array1, int[] array2) {
        if (array1 != null && array2 != null && array1.length > 0 && array2.length > 0) {
            int count = 0;
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        count++;
                    }
                }
            }

            int[] array3 = new int[count];

            for (int i = 0, k = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        array3[k] = array1[i];
                        k++;
                    }
                }
            }

            return array3;
        }

        return new int[0];
    }
}
