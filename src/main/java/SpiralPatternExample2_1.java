public class SpiralPatternExample2_1 {
    public static int[][] createBox(int width, int length) {
        int[][] box = new int[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                box[i][j] = 1 + Math.min(Math.min(i, length - i - 1), Math.min(j, width - j - 1));
                System.out.print(1 + Math.min(Math.min(i, length - i - 1), Math.min(j, width - j - 1)) + "  ");
            }
            System.out.println();
        }

        return box;
    }


    public static void main(String[] args) {
        int with = 8;
        int length = 8;

        createBox(with, length);
    }
}


