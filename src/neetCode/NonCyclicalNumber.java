package neetCode;

// https://neetcode.io/problems/non-cyclical-number

import java.util.HashSet;

public class NonCyclicalNumber {
    public static void main(String[] args) {
        System.out.println("true == " + NonCyclicalNumber.isHappy(100));
        System.out.println("true == " + NonCyclicalNumber.isHappy(19));
        System.out.println("false == " + NonCyclicalNumber.isHappy(2));
        System.out.println("false == " + NonCyclicalNumber.isHappy(101));
    }

    public static boolean isHappy(int number) {

        int turtle = number, hare = number;
        do {
            turtle = sumOfSquares(turtle);
            hare = sumOfSquares(sumOfSquares(hare));
        } while (turtle != hare && hare != 1);

        return hare == 1;

//        HashSet<Integer> repeatController = new HashSet<>();
//        while(number != 1) {
//            if(!repeatController.add(number)) {
//                return false;
//            }
//            number = sumOfSquares(number);
//        }
//        return true;
    }

    private static int sumOfSquares(int n) {
        int sum = 0;
        while(n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
