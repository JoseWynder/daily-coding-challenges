package leetCode;

// https://leetcode.com/problems/score-of-a-string/description/

public class ScoreOfAString {
    public static int scoreOfString(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i - 1) - s.charAt(i));
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println("13 == " + scoreOfString("hello"));
        System.out.println("50 == " + scoreOfString("zaz"));
    }

}
