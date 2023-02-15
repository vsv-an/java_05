import org.junit.Test;

import static org.junit.Assert.*;

public class EvenIndicesTest {
    @Test
    public void oddIndicesHappyPath() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {-45, 234, 12};
        assertArrayEquals(expectedResult, new EvenIndices().evenIndices(array));
    }
    @Test
    public void oddIndicesHappyPath2() {
        int[] array = new int[] {-45, 590, 234, 985, 12, 68, 1};
        int[] expectedResult = new int[]{-45, 234, 12, 1};
        assertArrayEquals(expectedResult, new EvenIndices().evenIndices(array));
    }

}