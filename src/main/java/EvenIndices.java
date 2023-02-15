import java.util.Arrays;

public class EvenIndices {
    public int[] evenIndices(int[] array) {
        int[] arrayEven = new int[(int) Math.ceil(array.length / 2.0)];

        if (array != null && array.length > 0) {
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    arrayEven[j] = array[i];
                    j++;
                }
            }

            return arrayEven;
        }

        return new int[0];
    }
}
