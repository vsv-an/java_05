public class ManipulationsWithArraysNew {
    public int[] multiplyArrayByNumber(int[] array, int number) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i] * number;
        }

        return newArray;
    }
    public double[] toDoubleArray(int[] array) {
        double[] newArray = new double[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i] * 1.0;
        }

        return newArray;
    }
    public int[] toIntArray(double[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int)array[i];
        }

        return newArray;
    }
    public String[] toStringArray(int[] array) {
        String[] newArray = new String[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i] + "";
        }

        return newArray;
    }
    public String[] toStringArray(double[] array) {
        String[] newArray = new String[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i] + "";
        }

        return newArray;
    }
}
