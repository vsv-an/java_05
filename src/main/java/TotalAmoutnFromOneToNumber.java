public class TotalAmoutnFromOneToNumber {
    public static void main(String[] args) {
        int result = 5;

        System.out.println(showTotalAmount(result));
    }
    public static int showTotalAmount(int value) {
        int result = 0;
        for (int i = 0; i <= value; i++) {
            result += i;
//            result += (int)Math.pow(i, 3);
        }
        return result;
    }
}
