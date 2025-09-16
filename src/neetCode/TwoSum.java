package neetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://neetcode.io/problems/two-integer-sum?list=blind75

public class TwoSum {

    public static void main(String[] args) {

        System.out.println("[0, 1] == " + Arrays.toString(twoSum(new int[]{3,4,5,6}, 7)));
        System.out.println("[0, 2] == " + Arrays.toString(twoSum(new int[]{4,5,6}, 10)));
        System.out.println("[0, 1] == " + Arrays.toString(twoSum(new int[]{5,5}, 10)));
        System.out.println("[3, 4] == " + Arrays.toString(twoSum(new int[]{-1,-2,-3,-4,-5}, -9)));
        System.out.println("[-1, -1] == " + Arrays.toString(twoSum(new int[]{0,0}, 10)));
        System.out.println("[1, 2] == " + Arrays.toString(twoSum(new int[]{2,5,5,11}, 10)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        int numbersLength = numbers.length;
        Map<Integer, Integer> numberToIndexMap = new HashMap<>();

        for (int currentIndex = 0; currentIndex < numbersLength; currentIndex++) {
            int currentNumber = numbers[currentIndex];
            int requiredNumber = target - currentNumber;

            if (numberToIndexMap.containsKey(requiredNumber)) {
                int requiredIndex = numberToIndexMap.get(requiredNumber);
                return new int[]{requiredIndex, currentIndex};
            }

            numberToIndexMap.put(currentNumber, currentIndex);
        }

        return new int[]{-1, -1};

    }

}
