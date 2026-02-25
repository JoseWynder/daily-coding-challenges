package neetCode;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/description/

public class MissingNumber {

    public static void main(String[] args) {

        System.out.println("0 == " + MissingNumber.missingNumber(new int[]{1}));
        System.out.println("1 == " + MissingNumber.missingNumber(new int[]{0}));
        System.out.println("1 == " + MissingNumber.missingNumber(new int[]{0, 2, 3}));

        System.out.println("0 == " + MissingNumber.missingNumber(new int[]{1, 2}));
        System.out.println("2 == " + MissingNumber.missingNumber(new int[]{0, 1}));
        System.out.println("2 == " + MissingNumber.missingNumber(new int[]{0, 1, 3, 4}));
    }

    public static int missingNumber(int[] nums) {

        int numCount = nums.length;

        int expectedSum = numCount * (numCount + 1) / 2;
        int actualSum = Arrays.stream(nums).sum();

        return expectedSum - actualSum;

    }
}
