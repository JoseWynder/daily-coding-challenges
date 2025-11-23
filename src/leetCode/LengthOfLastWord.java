package leetCode;

// https://leetcode.com/problems/length-of-last-word/description/

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String cleanString = s.trim();
        return cleanString.length() - cleanString.lastIndexOf(" ") - 1;
    }

    public static void main(String[] args) {
        System.out.println("5 == " + lengthOfLastWord("Hello World"));
        System.out.println("4 == " + lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("6 == " + lengthOfLastWord("luffy is still joyboy"));
    }
}
