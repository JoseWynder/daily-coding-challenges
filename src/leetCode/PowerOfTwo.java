package leetCode;

// https://leetcode.com/problems/power-of-two/description/

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;

//        if (n <= 0) return false;
//        while (n % 2 == 0) n /= 2;
//        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println("true == " + isPowerOfTwo(1));
        System.out.println("true == " + isPowerOfTwo(16));
        System.out.println("false == " + isPowerOfTwo(3));
    }
}
