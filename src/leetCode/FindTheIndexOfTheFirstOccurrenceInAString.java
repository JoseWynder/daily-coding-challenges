package leetCode;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println("0 == " + FindTheIndexOfTheFirstOccurrenceInAString.strStr(
                "sadbutsad", "sad"));
        System.out.println("-1 == " + FindTheIndexOfTheFirstOccurrenceInAString.strStr(
                "leetcode", "leeto"));
    }

    // In Java this problem is not a problem :-)
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
