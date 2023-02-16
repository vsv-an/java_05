import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

//import static org.junit.Assert.assertArrayEquals;


class CreateArrayNewTest {
    @Test
    public void createIntArrayHappyPath() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        int[] expectedResult = new int[] {1, 2, 3, 4, 5};

        assertArrayEquals(expectedResult, new CreateArray().createIntArray(a, b, c, d, e));
    }
    @Test
    public void createDoubleArrayHappyPath() {
        double a = 1.1;
        double b = 2.5;
        double c = 3.7;
        double d = 4.0;
        double e = 5.5;

        double[] expectedResult = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};

        assertArrayEquals(expectedResult, new CreateArray().createDoubleArray(a, b, c, d, e));
    }
    @Test
    public void createStringArrayHappyPath() {
        String a = "It";
        String b = "was";
        String c = "an";
        String d = "apple";
        String e = "pie";

        String[] expectedResult = new String[]{"It", "was", "an", "apple", "pie"};

        assertArrayEquals(expectedResult, new CreateArray().createStringArray(a, b, c, d, e));
    }
    @Test
    public void createArrayFromTextHappyPath() {
        String str = "It was an apple pie";
        String[] expectedResult = new String[]{"It", "was", "an", "apple", "pie"};

        assertArrayEquals(expectedResult, new CreateArray().createArrayFromText(str));
    }

    // Part 2.1 Arrays
    //
    //
    // 1. В классе CreateArray написать метод createIntArrayFromText(),
    // который принимает на вход строку чисел (н-р, “3 4 1 8 10 12.3”)
    // и возвращает массив типа int[] из этих чисел.

    @Test
    public void createIntArrayFromText() {
        String str = "3 4 1 8 10 12.3";
        int[] expectedResult = new int[] {3, 4, 1, 8, 10, 12};

        assertArrayEquals(expectedResult, new CreateArray().createIntArrayFromText(str));
    }
    @Test
    public void createIntArrayFromTextZeroLength() {
        String str = "";
        int[] expectedResult = new int[0];

        assertArrayEquals(expectedResult, new CreateArray().createIntArrayFromText(str));
    }
}