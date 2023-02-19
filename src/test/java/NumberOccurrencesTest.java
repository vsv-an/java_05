import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Part 2. Algorithms
15.	Написать алгоритм NumberOccurrences,  который принимает на вход
массив целых чисел,  и возвращает массив пар
{число, сколько раз число встречается в массиве}
 Test Data:
{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}
 */

class NumberOccurrencesTest {

    @Test
    void numberOccurrences() {
        Integer[] array = new Integer[]{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};

        Integer[][] expectedArray = new Integer[][]{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        assertArrayEquals(expectedArray, new NumberOccurrences().numberOccurrences(array));
    }
}