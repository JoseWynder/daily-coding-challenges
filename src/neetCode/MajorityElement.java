package neetCode;

// https://neetcode.io/problems/majority-element?list=neetcode250

import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

//    public static int majorityElement(int[] nums) {
//        int response = 0, count = 0;
//
//        for (int num : nums) {
//            if (count == 0) {
//                response = num;
//            }
//            count += (num == response) ? 1 : -1;
//        }
//        return response;
//    }

    public static void main(String[] args) {
        System.out.println("5 == " + majorityElement(new int[]{5,5,1,1,1,5,5}));
        System.out.println("2 == " + majorityElement(new int[]{2,2,2}));
        System.out.println("9 == " + majorityElement(new int[]{9,9,8}));
    }
}
