import java.util.*;

/*
Part 2. Algorithms
15.	Написать алгоритм NumberOccurrences,  который принимает на вход
массив целых чисел,  и возвращает массив пар
{число, сколько раз число встречается в массиве}
 Test Data:
{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}
 */
public class NumberOccurrences {
    public Object[] numberOccurrences(Integer[] array) {
        if (array != null && array.length > 1) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (Integer i : array) {
                Integer value = map.get(i);
                if (value == null) {
                    map.put(i, 1);
                } else {
                    map.put(i, ++value);
                }
            }
            Integer[][] arr = new Integer[map.size()][2];
            Set entries = map.entrySet();
            Iterator entriesIterator = entries.iterator();

            int i = 0;
            while (entriesIterator.hasNext()) {
                Map.Entry mapping = (Map.Entry) entriesIterator.next();

                arr[i][0] = Integer.parseInt(mapping.getKey().toString());
                arr[i][1] = Integer.valueOf(mapping.getValue().toString());
                i++;
            }

            System.out.println(Arrays.deepToString(arr));
            return arr;
        }

        return new Object[]{};
    }
}
