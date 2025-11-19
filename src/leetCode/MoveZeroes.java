package leetCode;

// https://leetcode.com/problems/move-zeroes/description/

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int insertPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[insertPosition];
                nums[insertPosition] = nums[i];
                nums[i] = temp;
                insertPosition++;
            }
        }

//        int zeroIndex = 0;
//        int notZeroIndex = 0;
//        while (true) {
//            while (zeroIndex < nums.length && nums[zeroIndex] != 0) zeroIndex++;
//            if (zeroIndex >= nums.length) return;
//
//            if (notZeroIndex <= zeroIndex) notZeroIndex = zeroIndex + 1;
//
//            while (notZeroIndex < nums.length && nums[notZeroIndex] == 0) notZeroIndex++;
//            if (notZeroIndex >= nums.length) return;
//
//            nums[zeroIndex] = nums[notZeroIndex];
//            nums[notZeroIndex] = 0;
//        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println("[1, 3, 12, 0, 0] == " + Arrays.toString(nums));

        nums = new int[]{0};
        moveZeroes(nums);
        System.out.println("[0] == " + Arrays.toString(nums));
    }
}
