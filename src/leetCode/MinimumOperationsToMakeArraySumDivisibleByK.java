package leetCode;

// https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/description/

public class MinimumOperationsToMakeArraySumDivisibleByK {
    public static int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) sum += num;
        return sum % k;
    }

    public static void main(String[] args) {
        System.out.println("4 == " + minOperations(new int[]{3,9,7}, 5));
        System.out.println("0 == " + minOperations(new int[]{4,1,3}, 4));
        System.out.println("5 == " + minOperations(new int[]{3,2}, 6));
    }
}
