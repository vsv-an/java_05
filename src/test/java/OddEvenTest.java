import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
    //Part 1 Algorithms
    // 1. В классе OddEven создать алгоритм oddEven(), который принимает на вход
    // целое число, возвращает “Odd”,  если число нечетное, и “Even”,
    // если число четное.
    //
    //Test Data:
    //-345 →  “Odd”
    //0 →  “Even”
    //222222 →  “Even”

    //Positive_testing_OddNumber Happy Path
    @Test
    public void OddNumber_HappyPath() {
        //AAA
        //Arrange
        int number = 1;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive_testing_ZeroIsEvenNumber Happy Path
    @Test
    public void ZeroIsEvenNumber_HappyPath() {
        //AAA
        //Arrange
        int number = 0;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive_testing_EvenNumber Happy Path
    @Test
    public void EvenNumber_HappyPath() {
        //AAA
        //Arrange
        int number = 222222;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



}
