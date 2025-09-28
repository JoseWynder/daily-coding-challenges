package leetCode;

// https://leetcode.com/problems/concatenation-of-array/description/

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        System.out.println("1,2,1,1,2,1 == " +
                Arrays.toString((ConcatenationOfArray.getConcatenation(new int[]{1,2,1}))));
        System.out.println("1,3,2,1,1,3,2,1 == " +
                Arrays.toString((ConcatenationOfArray.getConcatenation(new int[]{1,3,2,1}))));
    }

    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] concatenatedArray = new int[2 * length];

        System.arraycopy(nums, 0, concatenatedArray, 0, length);
        System.arraycopy(nums, 0, concatenatedArray, length, length);

        return concatenatedArray;

//        int[] concatenatedArray = new int[nums.length * 2];
//
//        for (int i = 0; i < nums.length; i++) {
//            concatenatedArray[i] = nums[i];
//            concatenatedArray[i + nums.length] = nums[i];
//        }
//
//        return concatenatedArray;
    }
}
