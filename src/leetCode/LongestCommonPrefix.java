package leetCode;

// https://neetcode.io/problems/longest-common-prefix?list=neetcode250

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        int i = 1;

        while(i < strs.length && !prefix.isEmpty()) {
            String s = strs[i++];
            while(!s.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        System.out.println("ba == " +
                longestCommonPrefix(new String[]{"bat","bag","bank","band"}));
        System.out.println("da == " +
                longestCommonPrefix(new String[]{"dance","dag","danger","damage"}));
        System.out.println("   == " +
                longestCommonPrefix(new String[]{"neet","feet"}));
    }
}
