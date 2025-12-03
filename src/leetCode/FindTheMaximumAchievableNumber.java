package leetCode;

// https://leetcode.com/problems/find-the-maximum-achievable-number/description/

public class FindTheMaximumAchievableNumber {
    public static int theMaximumAchievableX(int num, int t) {
        return 2 * t + num;
    }

    public static void main(String[] args) {
        System.out.println("6 == " + theMaximumAchievableX(4,1));
        System.out.println("7 == " + theMaximumAchievableX(3,2));
    }
}
