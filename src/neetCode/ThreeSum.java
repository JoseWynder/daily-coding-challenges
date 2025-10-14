package neetCode;

// https://neetcode.io/problems/three-integer-sum?list=neetcode150

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println("[[-1, -1, 2], [-1, 0, 1]] == "
                + threeSum(new int[]{-1,0,1,2,-1,-4}));
        System.out.println("[] == "
                + threeSum(new int[]{0,1,1}));
        System.out.println("[[0, 0, 0]] == "
                + threeSum(new int[]{0,0,0}));
        System.out.println("[[-2, 0, 2]] == "
                + threeSum(new int[]{-2,0,0,2,2}));
        System.out.println("[[0, 0, 0]] == "
                + threeSum(new int[]{0,0,0,0}));
    }

    public static List<List<Integer>> threeSum(int[] numbers) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 2; i++) {

            int currentNumber = numbers[i];
            if (currentNumber > 0) {
                break;
            }

            if (i > 0 && currentNumber == numbers[i - 1]) {
                continue;
            }

            int leftIndex = i + 1;
            int rightIndex = numbers.length - 1;

            while (leftIndex < rightIndex) {
                int leftNumber = numbers[leftIndex];
                int rightNumber = numbers[rightIndex];
                int sum = currentNumber + leftNumber + rightNumber;

                if (sum == 0) {
                    triplets.add(Arrays.asList(currentNumber, leftNumber, rightNumber));

                    while (leftIndex < rightIndex && numbers[leftIndex] == leftNumber) {
                        leftIndex++;
                    }

                    while (leftIndex < rightIndex && numbers[rightIndex] == rightNumber) {
                        rightIndex--;
                    }

                } else if (sum < 0) {
                    leftIndex++;
                } else {
                    rightIndex--;
                }
            }
        }

        return triplets;
    }
}
