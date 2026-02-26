package bit;

// https://leetcode.com/problems/number-of-1-bits/description/

public class NumberOfOneBits {
    public static void main(String[] args) {
        System.out.println("4 == " +
                hammingWeight(23));
        System.out.println("30 == " +
                hammingWeight(2147483645));
    }

    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

}
