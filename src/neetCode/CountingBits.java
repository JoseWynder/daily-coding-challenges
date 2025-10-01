package neetCode;

// https://neetcode.io/problems/counting-bits?list=neetcode150

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] arg) {
        System.out.println("[0, 1, 1, 2, 1] == " +
                Arrays.toString(CountingBits.countBits(4)));
        System.out.println("[...] == " +
                Arrays.toString(CountingBits.countBits(20)));
    }

    public static int[] countBits(int n) {

        int[] bitCounts = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            bitCounts[i] = bitCounts[i >> 1] + (i & 1);
        }
        return bitCounts;

//        int[] bitCounts = new int[n + 1];
//        for (int i = 1; i <= n; i++) {
//            if(i % 2 == 0) {
//                bitCounts[i] = bitCounts[i / 2];
//            } else {
//                bitCounts[i] = bitCounts[i - 1] + 1;
//            }
//        }
//        return bitCounts;
    }
}
