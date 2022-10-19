import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    // 4. Напишите алгоритм BiggerValue, который из двух параметров
    // типа int возвращает бОльшее значение.
    // Test Data:
    // 3333, 9999

    //1. Positive testing Happy path

    @Test
    public void biggerValue_PositivePath() {
        //AAA
        //arrange
        int x = 3333;
        int y = 9999;

        int expectedResult = 9999;

        //act
        int actualResult = new BiggerValue().biggerValue(x, y);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

}

}
