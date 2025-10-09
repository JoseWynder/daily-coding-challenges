package leetCode;

// https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println("0 == " +
                LongestConsecutiveSequence.longestConsecutive(new int[]{}));
        System.out.println("1 == " +
                LongestConsecutiveSequence.longestConsecutive(new int[]{100}));
        System.out.println("4 == " +
                LongestConsecutiveSequence.longestConsecutive(new int[]{100,4,200,1,3,2}));
        System.out.println("9 == " +
                LongestConsecutiveSequence.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
        System.out.println("3 == " +
                LongestConsecutiveSequence.longestConsecutive(new int[]{1,0,1,2}));
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;
        for (int num : numSet) {
            if(!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while(numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);

                if(longestStreak > numSet.size() / 2) {
                    return longestStreak;
                }
            }
        }

        return longestStreak;
    }
}
