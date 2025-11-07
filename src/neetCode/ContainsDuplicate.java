package neetCode;

// https://neetcode.io/problems/duplicate-integer?list=blind75

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int n : nums) {
            if(!numbers.add(n)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("true == " + hasDuplicate(new int[]{1,2,3,3}));
        System.out.println("false == " + hasDuplicate(new int[]{1,2,3,4}));
    }
}
