package leetCode;

// https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/

public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    public static int minimumOperations(int[] nums) {
        int count = 0;
        for (int num : nums) if (num % 3 != 0) count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println("3 == " + minimumOperations(new int[]{1,2,3,4}));
        System.out.println("0 == " + minimumOperations(new int[]{3,6,9}));
    }
}
