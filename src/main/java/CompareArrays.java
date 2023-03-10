import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 5 , 8, 2, 7, 3, 6, 0, 4, 9};
        int[] arr2 = new int[]{3, 8, 5};
        int[] arr3 = new int[3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0, k = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    arr3[i] = arr1[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
