import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    // Part 1.1 Arrays

    // Для заданий 10 и 11 необходимо писать методы в классе OddEvenValuesInArray,
    // а тестовые методы в классе OddEvenValuesInArrayTest
    // 10. Написать метод countEvenValuesInArray(), который принимает на вход
    // массив целых чисел,  и возвращает количество четных чисел в этом массиве

    //1. Happy Path

    @Test
    public void countEvenValuesInArray() {
        //AAA
        //Arrange
        int[] array = {1, 2, 3, 4, 5};

        int expectedResult = 2;

        //Act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // 11. Написать метод countOddValuesInArray(), который принимает на вход
    // массив целых чисел,  и возвращает количество нечетных чисел в этом массиве
    //1. Happy Path

    @Test
    public void countOddValuesInArray() {
        //AAA
        //Arrange
        int[] array = {1, 2, 3, 4, 5};

        int expectedResult = 3;

        //Act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

}
