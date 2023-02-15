public class CreateArray {
    // Part 1.1 Arrays
    // Методы и тесты из заданий 1-4 писать в классах -
    // CreateArray и CreateArrayTest.
    // В голубой папке java создать класс CreateArray, написать в этом классе
    // метод createIntArray(), который принимает на вход 5 целых чисел,
    // и возвращает массив из этих же чисел.
    // Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

    public int[] createIntArray(int a, int b, int c, int d, int e) {

        return new int[]{a, b, c, d, e};
    }
    // 2. Написать метод createDoubleArray(), который принимает на вход
    // 5 чисел типа double, и возвращает массив из этих же чисел
    // Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5)
    // -> {1.1, 2.5, 3.7, 4.0, 5.5}

    public double[] createDoubleArray(double a, double b, double c, double d, double e) {

        return new double[] {a, b, c, d, e};
    }

    // 3. Написать метод createStringArray(), который принимает на вход 5 слов,
    // и возвращает массив из этих слов
    // Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”)
    // -> {“It”, “was”, “an”, “apple”, “pie”}

    public String[] createStringArray(String a, String b, String c, String d, String e) {
        String[] array = {a, b, c, d, e};

        return array;
    }

    // 4. Написать метод createArrayFromText(), который принимает на вход
    // предложение из нескольких слов и возвращает массив из этих слов.
    // Например, createArrayFromText(“It was an apple pie”)
    // -> {“It”, “was”, “an”, “apple”, “pie”}

    public String[] createArrayFromText(String text) {
        //declaring an empty string array
        String[] array = null;
        //converting using String.split() method with whitespace as a delimiter
        array = text.split(" ");
        //return the converted string array

        return array;
    }



}
