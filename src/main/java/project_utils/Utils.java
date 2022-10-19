package project_utils;

public class Utils {

    public static int countFirstNumberInSequence(int start, int step) {
        if (step == 0) {

            return Integer.MIN_VALUE;
        } else if (start % step == 0) {

            return start;
        } else if (step > 0 && start < 0 || step < 0 && start > 0) {

            return start - start % step;
        } else {

            return start + (step - start % step);
        }
    }
}

