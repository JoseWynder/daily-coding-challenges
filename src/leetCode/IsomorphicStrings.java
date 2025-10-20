package leetCode;

// https://leetcode.com/problems/isomorphic-strings/description/

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println("true == " + isIsomorphic("egg", "add"));
        System.out.println("true == " + isIsomorphic("paper", "title"));
        System.out.println("false == " + isIsomorphic("foo", "bar"));
        System.out.println("false == " + isIsomorphic("bbbaaaba", "aaabbbba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[128];
        int[] mapT = new int[128];
        for (int i = 0; i < s.length(); i++) {
            int charS = s.charAt(i);
            int charT = t.charAt(i);

            if(mapS[charS] != mapT[charT]) {
                return false;
            }

            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }

        return true;
    }
}
