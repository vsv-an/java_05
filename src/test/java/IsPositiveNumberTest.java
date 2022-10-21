import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {
    //Part 1 Algorithms
    // 5. Напишите алгоритм IsPositiveNumber, который возвращает true,
    // если численный  параметр больше или равен нулю, и возвращает false,
    // если параметр меньше 0.
    // Проверьте работу метода на числах 555, 0 и -555.

    //1. Positive testing Happy path

  @Test
  public void isPositiveNumber_HappyPath() {
      //AAA
      //arrange
      int number = 555;

      boolean expectedResult = true;

      //act
      boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

      //Assert
      Assert.assertEquals(actualResult, expectedResult);
  }

    //2. Positive testing ZeroNumber Happy path

    @Test
    public void isZeroNumber_HappyPath() {
        //AAA
        //arrange
        int number = 0;

        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //1. Positive testing Happy path

    @Test
    public void isNegativeNumber_HappyPath() {
        //AAA
        //arrange
        int number = -555;

        boolean expectedResult = false;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
