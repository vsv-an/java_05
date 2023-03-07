public class NearSquareNumber {
//    Вот ещё очень интересная задача на циклы, а именно, в этой задаче можно
//    применить цикл for с двумя перменными i и j и это сильно поможет нам решить
//    её. Не используем никакие математические методы (sqrt() или pow()).
//    И так, задание: необходимо найти ближайшее квадратное число (square number)
//    заданному целому положительному числу. "Квадратное число" это целое число,
//    которое можно записать в виде квадрата какого-то целого числа. Например,
//    1,4,9,16,25 и т д это квадратные числа, потому что 1=1^2, 4=2^2, 9=3^2
//    и тд. Если на входе нам дали 20, то ответом будет 16, если на входе дали
//    нам 21, то ответ уже 25. Если на входе получили 25, то ответом должно быть
//    само число 25.

    public static void main(String[] args) {
//        int number = 21;
//        int number2 = number;
//        int result1 = 0;
//        int result2 = 0;
//
//        for (int k = number; k > 0; k--) {
//            int result = 0;
//            for(int i = 1, j = 1; i <= number; i++, j++) {
//                if (i * j == number) {
//                    result = i;
//                    break;
//                }
//            }
//            if (result > 0) {
//                result1 = number;
//            } else {
//                number--;
//            }
//        }
//
//        for (int k = number2; k <= number2 * 2; k++) {
//            int result = 0;
//            for(int i = 1, j = 1; i <= number2; i++, j++) {
//            if (i * j == number2) {
//                result = i;
//                break;
//            }
//        }
//            if (result > 0) {
//                result2 = number2;
//            } else {
//                number2++;
//            }
//        }
//
//        System.out.println(result1);
//        System.out.println(result2);


        int number = 21;
        int result1 = 0;
        int result2 = 0;
        for(int i = number; i > 0; i--) {
            if (Math.sqrt(i) % 1 == 0) {
                result1 = i;
                break;
            }
        }
        for(int i = number; i < number * 2; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                result2 = i;
                break;
            }
        }
        if (Math.abs(number - result1) < Math.abs(number - result2)) {
            System.out.println(result1);
        } else {
            System.out.println(result2);
        }
    }
}
