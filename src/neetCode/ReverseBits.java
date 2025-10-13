package neetCode;

// https://neetcode.io/problems/reverse-bits?list=neetcode150

public class ReverseBits {
    public static void main(String[] args) {
//        System.out.println("2818572288 == " + reverseBits(21));
        System.out.println("2818572288 == " +
                Integer.toUnsignedString(reverseBits(21)));
        System.out.println("2818572288 == " +
                Integer.toUnsignedLong(reverseBits(21)));
    }

    public static int reverseBits(int n) {
        return Integer.reverse(n);
    }
}
