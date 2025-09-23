package neetCode;

// https://neetcode.io/problems/is-palindrome?list=blind75

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println("true == " + ValidPalindrome.isPalindrome("Socorram-me, subi nô ônibus em Marrocos"));
        System.out.println("true == " + ValidPalindrome.isPalindrome("Was it a car or a cat I saw?"));
        System.out.println("false == " + ValidPalindrome.isPalindrome("tab a cat"));
        System.out.println("true == " + ValidPalindrome.isPalindrome("  "));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;

        while(left < right) {

            while(left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
