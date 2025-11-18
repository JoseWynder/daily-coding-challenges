package neetCode;

// https://neetcode.io/problems/contains-duplicate-ii/question?list=neetcode250

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {

            if(right - left > k) {
                window.remove(nums[left]);
                left++;
            }

            if(!window.add(nums[right])) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("true == " + containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        System.out.println("false == " + containsNearbyDuplicate(new int[]{2,1,2}, 1));
        System.out.println("true == " + containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }
}
