public class AreNumbersEqual {
    // Part 1 Algorithms
    // 6. Напишите алгоритм AreNumbersEqual, который принимает на вход
    // 2 любых int числа, и возвращает
    //0 , если числа равны
    // -1, если первое число меньше второго
    // 1, если первое число больше второго
    // Test Data:
    // 89, 89
    // Expected result: 0
    //- 89, 89
    // Expected result: -1
    // 89, -89
    // Expected result: 1
    public int areNumbersEqual(int x, int y) {
        if (x == y) {

            return 0;
        } else if (x < y) {

            return -1;
        }

        return 1;
    }


}
