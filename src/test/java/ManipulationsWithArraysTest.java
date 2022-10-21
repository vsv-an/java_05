import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    //Part 1.1 Arrays
    //Для заданий 5-9 необходимо писать методы в классе ManipulationsWithArrays,
    //а тестовые методы в классе ManipulationsWithArraysTest
    //
    //1. Написать метод multiplуArrayByNumber(), который принимает на вход
    //массив целых чисел и число int number. Метод возвращает массив
    //тех же чисел, умноженных на number
    //Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}

    //1. Positive testing Happy path

    @Test
    public void manipulationsWithArrays() {
        //AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;

        int[] expectedResult = {3, 6, 9, 12, 15};

        //act
        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 6. Написать метод toDoubleArray(), который принимает на вход
    // массив целых чисел,  и возвращает массив типа double[] из тех же чисел
    // Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}

    //2. Positive testing Happy path

    @Test
    public void toDoubleArray() {
        //AAA
        //arrange
        int[] array = {1, 2, 3, 4, 5};

        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        //act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 7. Написать метод toIntArray(), который принимает на вход массив
    // типа double[],  и возвращает массив типа int[] из тех же чисел
    // Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}

    //3. Positive testing Happy path
    @Test
    public void toIntArray() {
        //AAA
        //arrange
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};

        int[] expectedResult = {1, 2, 3, 4, 5};

        //act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 8. Написать метод toStringArray(), который принимает на вход
    // массив целых чисел,  и возвращает массив типа String[] из тех же чисел
    // (желательно не использовать метод .toString(), нужно переводить вручную)
    // Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}

    //4. Positive testing Happy path
    @Test
    public void toStringArray() {
        //AAA
        //Arrange
        int[] array = {1, 2, 3, 4, 5};

        String[] expectedResult = {"1", "2", "3", "4", "5"};

        //Act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 9. Перегрузить метод toStringArray() параметром double[].
    // Этот метод должен возвращать массив типа String[]
    // (желательно не использовать метод .toString(), нужно переводить вручную)
    // Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5})
    // -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}

    //5. Positive testing Happy path
    @Test
    public void toStringArrayFromDouble() {
        //AAA
        //Arrange
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};

        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        //Act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 12. В классе ManipulationsWithArrays написать метод
    // areValuesGreaterThanNumber(), который принимает на вход массив
    // целых чисел и число number. Метод возвращает значение true,
    // если все элементы массива больше number, иначе возвращает false

    //1. Positive testing Happy path
    @Test
    public void areValuesGreaterThanNumber() {
        //AAA
        //Arrange
        int[] array = {2, 2, 3, 4, 5};
        int number = 1;

        boolean expectedResult = true;

        //Act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //2. Positive testing Happy path
    @Test
    public void areValuesLessThanNumber() {
        //AAA
        //Arrange
        int[] array = {2, 2, 3, 4, 5};
        int number = 3;

        boolean expectedResult = false;

        //Act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
