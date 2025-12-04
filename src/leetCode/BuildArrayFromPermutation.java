package leetCode;

// https://leetcode.com/problems/build-array-from-permutation/description/

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }

        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println("[0, 1, 2, 4, 5, 3] == " +
                Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));
        System.out.println("[4, 5, 0, 1, 2, 3] == " +
                Arrays.toString(buildArray(new int[]{5,0,1,2,3,4})));
    }
}
