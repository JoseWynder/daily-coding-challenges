package neetCode;

// https://neetcode.io/problems/binary-search?list=neetcode150

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("3 == " +
                search(new int[]{-1,0,2,4,6,8}, 4));
        System.out.println("-1 == " +
                search(new int[]{-1,0,2,4,6,8}, 3));
        System.out.println("4 == " +
                search(new int[]{-1,0,3,5,9,12}, 9));
        System.out.println("2 == " +
                search(new int[]{-1,0,3,5,9,12}, 3));
    }

    public static int search(int[] nums, int target) {

        if(nums[0] > target || nums[nums.length - 1] < target) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (right + left) >>> 1;

            if(nums[mid] < target) {
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;

//        int index = Arrays.binarySearch(nums, target);
//        return index >= 0 ? index : -1;
    }
}
