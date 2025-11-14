package neetCode;

// https://neetcode.io/problems/valid-palindrome-ii?list=neetcode250

public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s,left + 1, right) ||
                        isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("true == " + validPalindrome("aca"));
        System.out.println("true == " + validPalindrome("abccba"));
        System.out.println("true == " + validPalindrome("abbda"));
        System.out.println("true == " + validPalindrome("adbba"));
        System.out.println("false == " + validPalindrome("abbadc"));
    }
}
