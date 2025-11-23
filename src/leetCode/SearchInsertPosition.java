package leetCode;

// https://leetcode.com/problems/search-insert-position/description/

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = (right + left) >> 1;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        System.out.println("0 == " + searchInsert(new int[]{1,3,5,6}, 0));
        System.out.println("0 == " + searchInsert(new int[]{1,3,5,6}, 1));

        System.out.println("1 == " + searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println("2 == " + searchInsert(new int[]{1,3,5,6}, 5));

        System.out.println("3 == " + searchInsert(new int[]{1,3,5,6}, 6));
        System.out.println("4 == " + searchInsert(new int[]{1,3,5,6}, 7));
    }
}
