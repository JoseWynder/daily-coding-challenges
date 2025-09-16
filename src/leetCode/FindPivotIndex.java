package leetCode;

// Challenge of Meta
// https://leetcode.com/problems/find-pivot-index/description/

import java.util.Arrays;

public class FindPivotIndex {

    public static void main(String[] args) {
        System.out.println("3 == " + FindPivotIndex.numberPivot(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println("2 == " + FindPivotIndex.numberPivot(new int[]{2, 4, 5, 6, 0}));
        System.out.println("0 == " + FindPivotIndex.numberPivot(new int[]{0, 0, 0, 0, 0}));
        System.out.println("0 == " + FindPivotIndex.numberPivot(new int[]{2,1,-1}));
        System.out.println("-1 == " + FindPivotIndex.numberPivot(new int[]{1,2,3}));
    }

    public static int numberPivot(int[] numbers) {

        int currentSum = Arrays.stream(numbers).sum();
        int leftSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (leftSum == currentSum - leftSum - numbers[i]) {
                return i;
            }
            leftSum += numbers[i];
        }

        return -1;
    }

}
