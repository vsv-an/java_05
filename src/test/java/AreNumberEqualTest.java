import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumberEqualTest {
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

    //1. Positive testing Happy path
    @Test
    public void areNumberEqual_HappyPath() {
        //AAA
        //arrange
        int x = 89;
        int y = 89;
        int expectedResult = 0;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(x, y);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Positive testing xLessY Happy path
    @Test
    public void areNumberXLessY_HappyPath() {
        //AAA
        //arrange
        int x = -89;
        int y = 89;
        int expectedResult = -1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(x, y);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //3. Positive testing xMoreY Happy path
    @Test
    public void areNumberXMoreY_HappyPath() {
        //AAA
        //arrange
        int x = 89;
        int y = -89;
        int expectedResult = 1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(x, y);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
