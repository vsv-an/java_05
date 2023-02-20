public class SpiralPatternExample3 {
    public static void main(String[] args) {
        int size = 10;
        int[][] board = new int[size][size];
        int left = 0;
        int top = size - 1;
        int n = 1;
        for (int i = 1; i <= size / 2; i++, left++, top--) {
            //fill from left to right
            for (int j = left; j <= top; j++, n++) {
                board[left][j] = n;
            }
            //fill from top to down
            for (int j = left + 1; j <= top; j++, n++) {
                board[j][top] = n;
            }
            //fill from right to left
            for (int j = top - 1; j >= left; j--, n++) {
                board[top][j] = n;
            }
            //fill from down to top
            for (int j = top - 1; j >= left + 1; j--, n++) {
                board[j][left] = n;
            }
        }
        //print the pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%5d", board[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
