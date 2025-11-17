package neetCode;

// https://neetcode.io/problems/remove-duplicates-from-sorted-array?list=neetcode250

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length < 3) return nums.length;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]) nums[++i] = nums[j];
        }

        return i + 1;
    }

    public static void main(String[] args) {
        System.out.println("4 == " + removeDuplicates(new int[]{1,1,2,3,4}));
        System.out.println("3 == " + removeDuplicates(new int[]{2,10,10,30,30,30}));
    }
}
