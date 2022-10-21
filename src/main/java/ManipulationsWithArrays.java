public class ManipulationsWithArrays {

    //Part 1.1 Arrays
    //Для заданий 5-9 необходимо писать методы в классе ManipulationsWithArrays,
    //а тестовые методы в классе ManipulationsWithArraysTest
    //
    // 5. Написать метод multiplуArrayByNumber(), который принимает на вход
    //массив целых чисел и число int number. Метод возвращает массив
    //тех же чисел, умноженных на number
    //Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
    public int[] multiplyArrayByNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * number;
        }

        return array;
    }

    // 6. Написать метод toDoubleArray(), который принимает на вход
    // массив целых чисел,  и возвращает массив типа double[] из тех же чисел
    // Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
    public double[] toDoubleArray(int[] array) {
        double[] array1 = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        return array1;
    }

    // 7. Написать метод toIntArray(), который принимает на вход массив
    // типа double[],  и возвращает массив типа int[] из тех же чисел
    // Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
    public int[] toIntArray(double[] array) {
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = (int)array[i];
        }

        return array1;
    }

    // 8. Написать метод toStringArray(), который принимает на вход
    // массив целых чисел,  и возвращает массив типа String[] из тех же чисел
    // (желательно не использовать метод .toString(), нужно переводить вручную)
    // Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
    public String[] toStringArray(int[] array) {
        String[] array1 = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = String.valueOf(array[i]);
        }

        return array1;
    }

    // 9. Перегрузить метод toStringArray() параметром double[].
    // Этот метод должен возвращать массив типа String[]
    // (желательно не использовать метод .toString(), нужно переводить вручную)
    // Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5})
    // -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
    public String[] toStringArray(double[] array) {
        String[] array1 = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = String.valueOf(array[i]);
        }

        return array1;
    }

    // 12. В классе ManipulationsWithArrays написать метод
    // areValuesGreaterThanNumber(), который принимает на вход массив
    // целых чисел и число number. Метод возвращает значение true,
    // если все элементы массива больше number, иначе возвращает false
    public boolean areValuesGreaterThanNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (number < array[i]) {
                return true;
            }
            return false;
        }
        return false;
    }

}
