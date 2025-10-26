package leetCode;

// https://leetcode.com/problems/pascals-triangle-ii/description/

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        int[] pascalRow = new int[rowIndex + 1];
        pascalRow[0] = 1;

        buildPascalRow(pascalRow, rowIndex, 1);

        List<Integer> result = new ArrayList<>();
        for (int value : pascalRow) {
            result.add(value);
        }
        return result;
    }

    private static void buildPascalRow(int[] pascalRow, int targetRow, int currentRow) {
        if (currentRow == targetRow + 1) return;

        for (int i = currentRow; i > 0; i--) {
            pascalRow[i] = pascalRow[i] + pascalRow[i - 1];
        }

        buildPascalRow(pascalRow, targetRow, currentRow + 1);
    }

    public static void main(String[] args) {
        System.out.println("[1] == " + getRow(0));
        System.out.println("[1, 1] == " + getRow(1));
        System.out.println("[1, 2, 1] == " + getRow(2));
        System.out.println("[1, 3, 3, 1] == " + getRow(3));
        System.out.println("[1, 4, 6, 4, 1] == " + getRow(4));
        System.out.println("[1, 5, 10, 10, 5, 1] == " + getRow(5));
        System.out.println("[1, 6, 15, 20, 15, 6, 1] == " + getRow(6));
        System.out.println("[1, 7, 22, 35, 35, 22, 7, 1] == " + getRow(7));
    }
}
