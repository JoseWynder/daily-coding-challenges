package leetCode;

// https://leetcode.com/problems/palindrome-number/description/

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("true == " + PalindromeNumber.isPalindrome(121));
        System.out.println("true == " + PalindromeNumber.isPalindrome(3443));
        System.out.println("true == " + PalindromeNumber.isPalindrome(0));
        System.out.println("false == " + PalindromeNumber.isPalindrome(1212));
        System.out.println("false == " + PalindromeNumber.isPalindrome(-343));
        System.out.println("false == " + PalindromeNumber.isPalindrome(10));

    }

    public static boolean isPalindrome(int number) {
        // Negative numbers are never palindromes.
        // Numbers that are multiples of 10 are never palindromes, except for 0.
        if(number < 0 || (number % 10 == 0 && number != 0)) {
            return false;
        }

        int invertedHalf = 0;

        while(number > invertedHalf) {
            int lastDigit = number % 10;
            invertedHalf = invertedHalf * 10 + lastDigit;
            number /= 10;
        }

        return (number == invertedHalf) || (number == invertedHalf / 10);


        // Simple solution, but not very efficient because it needs to convert to String and create objects
//        String s = Integer.toString(number);
//        return s.contentEquals(new StringBuilder(s).reverse());
    }
}
