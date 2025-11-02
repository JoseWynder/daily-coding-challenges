package leetCode;

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

public class FinalValueOfVariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println("1 == " + finalValueAfterOperations(
                new String[]{"--X","X++","X++"}));
        System.out.println("3 == " + finalValueAfterOperations(
                new String[]{"++X","++X","X++"}));
        System.out.println("0 == " + finalValueAfterOperations(
                new String[]{"X++","++X","--X","X--"}));
    }
}
