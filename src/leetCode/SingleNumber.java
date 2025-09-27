package leetCode;

// https://leetcode.com/problems/single-number/description/

import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println("1 == " + SingleNumber.singleNumber(new int[]{2,2,1}));
        System.out.println("4 == " + SingleNumber.singleNumber(new int[]{4,1,2,1,2}));
        System.out.println("1 == " + SingleNumber.singleNumber(new int[]{1}));
    }

    public static int singleNumber(int[] nums) {

        // Solution with XOR 😲
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;


//        HashSet<Integer> set = new HashSet<>();
//        int result = 0;
//        for (int num : nums) {
//            if(set.add(num)) {
//                result += num;
//            } else {
//                result-= num;
//            }
//        }
//
//        return result;
    }
}
