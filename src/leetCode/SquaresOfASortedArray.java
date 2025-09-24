package leetCode;

// https://leetcode.com/problems/squares-of-a-sorted-array/description/

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
                System.out.println("[0, 1, 4, 9, 16, 25] == " + Arrays.toString(
                SquaresOfASortedArray.sortedSquares(new int[]{-5,-4,-1,0,2,3})));
                System.out.println("[0, 1, 4, 9, 16, 25] == " + Arrays.toString(
                SquaresOfASortedArray.sortedSquares(new int[]{-5,-4,-3,-2,-1,0})));
    }

    public static int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        int[] orderedSquares = new int[nums.length];

        for (int i = nums.length-1; i >= 0; i--) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                orderedSquares[i] = leftSquare;
                left++;
            } else {
                orderedSquares[i] = rightSquare;
                right--;
            }
        }

        return orderedSquares;
    }
}
