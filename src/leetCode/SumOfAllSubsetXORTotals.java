package leetCode;

// https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/

public class SumOfAllSubsetXORTotals {
    public static int subsetXORSum(int[] nums) {
        int or = 0;
        for (int num : nums) or |= num;
        return or * (1 << (nums.length - 1));
    }

    public static void main(String[] args) {
        System.out.println("6 == " + subsetXORSum(new int[]{1,3}));
        System.out.println("28 == " + subsetXORSum(new int[]{5,1,6}));
        System.out.println("480 == " + subsetXORSum(new int[]{3,4,5,6,7,8}));
    }
}
