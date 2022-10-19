public class BiggerValue {
    // 4. Напишите алгоритм BiggerValue, который из двух параметров
    // типа int возвращает бОльшее значение.
    // Test Data:
    // 3333, 9999
    public int biggerValue(int x, int y) {
        if (x > y) {

            return x;
        } else if (y > x) {

            return y;
        }
        return 0;
    }
}
