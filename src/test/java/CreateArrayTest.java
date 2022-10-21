import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {
    // Part 1.1 Arrays
    // Методы и тесты из заданий 1-4 писать в классах -
    // CreateArray и CreateArrayTest.
    // В голубой папке java создать класс CreateArray, написать в этом классе
    // метод createIntArray(), который принимает на вход 5 целых чисел,
    // и возвращает массив из этих же чисел.
    // Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

    //1. Positive testing Happy path

    @Test
    public void createIntArray_HappyPath() {
        //AAA
        //arrange
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        int[] expectedResult = {1, 2, 3, 4, 5};

        //act
        int[] actualResult = new CreateArray().createIntArray(a, b, c, d, e);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2. Написать метод createDoubleArray(), который принимает на вход
    // 5 чисел типа double, и возвращает массив из этих же чисел
    // Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5)
    // -> {1.1, 2.5, 3.7, 4.0, 5.5}

    //2. Positive testing Happy path

    @Test
    public void createDoubleArray_HappyPath() {
        //AAA
        //arrange
        double a = 1.1;
        double b = 2.5;
        double c = 3.7;
        double d = 4.0;
        double e = 5.5;

        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

        //act
        double[] actualResult = new CreateArray().createDoubleArray(a, b, c, d, e);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 3. Написать метод createStringArray(), который принимает на вход 5 слов,
    // и возвращает массив из этих слов
    // Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”)
    // -> {“It”, “was”, “an”, “apple”, “pie”}

    //3. Positive testing Happy path

    @Test
    public void createStringArray_HappyPath() {
        //AAA
        //arrange
        String a = "It";
        String b = "was";
        String c = "an";
        String d = "apple";
        String e = "pie";

        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        //act
        String[] actualResult = new CreateArray().createStringArray(a, b, c, d, e);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 4. Написать метод createArrayFromText(), который принимает на вход
    // предложение из нескольких слов и возвращает массив из этих слов.
    // Например, createArrayFromText(“It was an apple pie”)
    // -> {“It”, “was”, “an”, “apple”, “pie”}

    //3. Positive testing Happy path

    @Test
    public void createArrayFromText_HappyPath() {
        //AAA
        //arrange
        String text = "It was an apple pie";


        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        //act
        String[] actualResult = new CreateArray().createArrayFromText(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
