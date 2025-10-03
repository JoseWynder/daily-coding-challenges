package neetCode;

// https://neetcode.io/problems/climbing-stairs?list=neetcode150

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println("1 == " + ClimbingStairs.climbStairs(1));
        System.out.println("2 == " + ClimbingStairs.climbStairs(2));
        System.out.println("3 == " + ClimbingStairs.climbStairs(3));
        System.out.println("5 == " + ClimbingStairs.climbStairs(4));
        System.out.println("8 == " + ClimbingStairs.climbStairs(5));
        System.out.println("13 == " + ClimbingStairs.climbStairs(6));
        System.out.println("21 == " + ClimbingStairs.climbStairs(7));
    }

    public static int climbStairs(int n) {

        int secondLast = 0, last = 1;
        for (int i = 1; i < n; i++) {
            int temp = secondLast;
            secondLast = last;
            last += temp;
        }

        return last + secondLast;
    }
}
