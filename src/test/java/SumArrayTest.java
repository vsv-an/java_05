import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {
    // Part 1 Algorithms
    // 3. Написать алгоритм SumArray, который возвращает
    // сумму всех чисел массива
    //Test Data:
    //{0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10

        //1. Positive testing Happy path

    @Test
    public void sumArray_HappyPath() {
        //AAA
        //arrange
        int[] array = {0, 1, 2, 3, 4, 5};

        int expectedResult = 15;

        //act
        int actualResult = new SumArray().sumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Positive testing negative number Happy path

    @Test
    public void sumArrayNegativeNumber_HappyPath() {
        //AAA
        //arrange
        int[] array = {-7, -3};

        int expectedResult = -10;

        //act
        int actualResult = new SumArray().sumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
