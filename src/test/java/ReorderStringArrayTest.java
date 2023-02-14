import org.testng.Assert;
import org.testng.annotations.Test;

public class ReorderStringArrayTest {
    @Test
    public void reorderStringArrayTestHappyPath() {
        //AAA
        //Arrange
        String[] colorObject = new String[]{"С", "С", "З", "С", "К", "З", "З", "З", "К", "К", "С", "З", "С", "С", "К", "З"};
        String[] expectedResult = new String[]{"З", "З", "З", "З", "З", "З", "С", "С", "С", "С", "С", "С", "К", "К", "К", "К"};
        //Act
        String[] actualResult = new ReorderStringArray().reorder(colorObject);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
