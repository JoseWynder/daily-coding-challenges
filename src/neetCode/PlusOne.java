package neetCode;

// https://neetcode.io/problems/plus-one?list=neetcode150

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println("[1, 2, 3, 5] == " +
                Arrays.toString(PlusOne.plusOne(new int[]{1,2,3,4})));
        System.out.println("[1, 0, 0, 0] == " +
                Arrays.toString(PlusOne.plusOne(new int[]{9,9,9})));
        System.out.println("[9, 9, 0, 0] == " +
                Arrays.toString(PlusOne.plusOne(new int[]{9,8,9,9})));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] digitsAfterPlusOne = new int[digits.length + 1];

        digitsAfterPlusOne[0] = 1;
        return digitsAfterPlusOne;
    }
}
