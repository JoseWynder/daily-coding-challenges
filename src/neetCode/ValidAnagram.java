package neetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// https://neetcode.io/problems/is-anagram?list=blind75


public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println("false == " + ValidAnagram.isAnagram("aaa", "aa"));
        System.out.println("false == " + ValidAnagram.isAnagram("racecar", "caraace"));
        System.out.println("true == " + ValidAnagram.isAnagram("racecar", "carrace"));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;


        // Uses an Integer array where we increment counts for s and decrement counts for t.
        // Each array position represents a character.
        // Works only with lowercase letters.
        // If you need a larger character set, you would need to increase the array size manually.
        // Time complexity: O(n)
        // Space complexity: O(1)

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;


        // Uses a map with key(character) and value(frequency).
        // Increment for s, decrement for t.
        // Works with uppercase letters, special characters, emojis, etc.
        // Time complexity: O(n)
        // Space complexity: O(k), where k = number of distinct characters.

//        HashMap<Character, Integer> count = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
//            count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) - 1);
//        }
//
//        for (int val : count.values()) {
//            if (val != 0) {
//                return false;
//            }
//        }
//        return true;


        // Coverts strings to char arrays and sorts them based on Unicode values.
        // Time complexity: O(n log n)
        // Space complexity: O(n)

//        char[] sSort = s.toCharArray();
//        char[] tSort = t.toCharArray();
//        Arrays.sort(sSort);
//        Arrays.sort(tSort);
//        return Arrays.equals(sSort,tSort);


        // Brute force! Iterates through s and removes matching characters from t using regex.
        // Time complexity: O(n^2)
        // Space complexity:O(n)

//        for (int i = 0; i < s.length(); i++) {
//            t = t.replaceFirst(Character.toString(s.charAt(i)),"");
//        }
//
//        return t.isEmpty();

    }
}
