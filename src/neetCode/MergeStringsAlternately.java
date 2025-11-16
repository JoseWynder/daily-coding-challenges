package neetCode;

// https://neetcode.io/problems/merge-strings-alternately?list=neetcode250

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder(word1.length() + word2.length());
        int i = 0;

        while (i < word1.length() && i < word2.length()) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }

        if (i < word1.length()) {
            sb.append(word1, i, word1.length());
        } else if (i < word2.length()) {
            sb.append(word2, i, word2.length());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("axbycz == " + mergeAlternately("abc", "xyz"));
        System.out.println("aabbbxxc == " + mergeAlternately("ab", "abbxxc"));

    }
}
