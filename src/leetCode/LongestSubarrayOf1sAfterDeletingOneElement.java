package leetCode;

// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/

public class LongestSubarrayOf1sAfterDeletingOneElement {
    public static void main(String[] args) {
        System.out.println("0 == " + LongestSubarrayOf1sAfterDeletingOneElement
                        .longestSubarray(new int[]{}));
        System.out.println("1 == " + LongestSubarrayOf1sAfterDeletingOneElement
                        .longestSubarray(new int[]{1,0,0,1}));
        System.out.println("2 == " + LongestSubarrayOf1sAfterDeletingOneElement
                        .longestSubarray(new int[]{1,1,1}));
        System.out.println("3 == " + LongestSubarrayOf1sAfterDeletingOneElement
                        .longestSubarray(new int[]{1,1,0,1}));
        System.out.println("5 == " + LongestSubarrayOf1sAfterDeletingOneElement
                        .longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
    }

    public static int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int left = 0;
        int maxWindowSize = 0;

        for (int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) {
                zeroCount++;
            }

            while(zeroCount > 1) {
                if(nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxWindowSize = Math.max(maxWindowSize, right - left);
        }

        return maxWindowSize;

        // This solution is a little more efficient, but with more complex logic.
//        if(nums.length < 2) return 0;
//
//        int left = 0;
//        int right = 0;
//        int result = 0;
//
//        for (int num : nums) {
//            if (num == 1) {
//                right++;
//            } else {
//                result = Math.max(result, right + left);
//                left = right;
//                right = 0;
//            }
//        }
//
//        result = Math.max(result, right + left);
//        if(result == nums.length) result--;
//        return result;
    }
}
