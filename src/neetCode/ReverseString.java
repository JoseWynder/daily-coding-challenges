package neetCode;

// https://neetcode.io/problems/reverse-string?list=neetcode250

public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }

    public static void main(String[] args) {
        char[] arr = {'n', 'e', 'e', 't'};
        reverseString(arr);
        System.out.print("teen == ");
        System.out.println(arr);

        arr = new char[]{'r', 'a', 'c', 'e', 'c', 'a', 'r'};
        reverseString(arr);
        System.out.print("racecar == ");
        System.out.println(arr);

        arr = new char[]{'r', 'a'};
        reverseString(arr);
        System.out.print("ar == ");
        System.out.println(arr);

    }
}
