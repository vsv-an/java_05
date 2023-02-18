import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
Part 2 Algorithms
9. Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
и возвращает массив общих элементов.

Test Data:
{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
{1, 2, 4, 5, 89}, {8, 9, 45} → {}
 */
class IntersectionTest {

    @Test
    void intersection1() {
        int[] array1 = new int[]{1, 2, 4, 5, 89};
        int[] array2 = new int[]{8, 9, 4, 2};

        int[] expectedResult = new int[]{2, 4};

        assertArrayEquals(expectedResult, new Intersection().intersection(array1, array2));
    }
    @Test
    void intersection2() {
        int[] array1 = new int[]{1, 2, 4, 5, 8, 9};
        int[] array2 = new int[]{8, 9, -4, -2};

        int[] expectedResult = new int[]{8, 9};

        assertArrayEquals(expectedResult, new Intersection().intersection(array1, array2));
    }
    @Test
    void intersection3() {
        int[] array1 = new int[]{1, 2, 4, 5, 89};
        int[] array2 = new int[]{8, 9, 45};

        int[] expectedResult = new int[]{};

        assertArrayEquals(expectedResult, new Intersection().intersection(array1, array2));
    }
    @Test
    void intersection4() {
        int[] array1 = new int[]{8, 9, -4, -2};
        int[] array2 = new int[]{1, 2, 4, 5, 8, 9};

        int[] expectedResult = new int[]{8, 9};

        assertArrayEquals(expectedResult, new Intersection().intersection(array1, array2));
    }
}