package neetCode;

// https://neetcode.io/problems/validate-parentheses

public class ValidParentehses {

    public static void main(String[] str) {

        System.out.println("false == " + ValidParentehses.isValid("[]]"));
        System.out.println("false == " + ValidParentehses.isValid("[(])"));

        System.out.println("true == " + ValidParentehses.isValid("[]"));
        System.out.println("true == " + ValidParentehses.isValid("([{}])"));
        System.out.println("true == " + ValidParentehses.isValid("(){}[]"));
    }

    public static boolean isValid(String s) {

        if(s.length() % 2 == 1) { return false; }

        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "")
                .replace("[]", "")
                .replace("{}", "");
        }

        return s.isEmpty();
    }
}
