package leetCode;

// https://leetcode.com/problems/sqrtx/description/

public class SqrtX {
    public static void main(String[] args) {
        System.out.println("0 == " + SqrtX.mySqrt(0));
        System.out.println("1 == " + SqrtX.mySqrt(1));
        System.out.println("2 == " + SqrtX.mySqrt(4));
        System.out.println("2 == " + SqrtX.mySqrt(8));
        System.out.println("3 == " + SqrtX.mySqrt(9));
        System.out.println("46340 == " + SqrtX.mySqrt(2_147_483_647));
    }

    public static int mySqrt(int x) {
        int left = 10_000;
        while(left * left > x) {
            left /= 10;
        }

        int right = Math.min(left * 10, 46_340);
        while(left < right) {
            int mid = (right + left + 1) / 2;
            int square = mid * mid;

            if(square == x) {
                return mid;
            } else if(square > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        return left;
    }
}
