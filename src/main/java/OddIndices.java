public class OddIndices {
    // Part 1 Algorithms
    // 2. Написать алгоритм OddIndices, который принимает массив целых чисел,
    // и возвращает массив значений нечетных индексов
    // Test Data:
    // Input = {-45, 590, 234, 985, 12, 68}
    // Expected Result =  {590, 985, 68}
    public int[] oddIndices(int[] array) {
        if (array != null && array.length > 0) {
            int oddInd = 0;
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    oddInd++;
                }
            }
            int[] arrayOdd = new int[oddInd];
            int odd = 0;
            for (int i = 0; i < array.length & odd < oddInd; i++) {
                if (i % 2 == 0) {
                    continue;
                } else {
                    arrayOdd[odd] = array[i];
                }
                odd++;
            }

            return arrayOdd;
        }

        return new int[0];
    }
}
