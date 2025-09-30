package leetCode;

// https://leetcode.com/problems/valid-sudoku/description/

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        System.out.println("true == " +
                ValidSudoku.isValidSudoku( new char[][]
                        {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        ,{'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        ,{'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        ,{'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        ,{'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        ,{'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        ,{'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        ,{'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        ,{'.', '.', '.', '.', '8', '.', '.', '7', '9'}}
                ));
        System.out.println("false == " +
                ValidSudoku.isValidSudoku( new char[][]
                        {{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                        ,{'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        ,{'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        ,{'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        ,{'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        ,{'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        ,{'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        ,{'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        ,{'.', '.', '.', '.', '8', '.', '.', '7', '9'}}
                ));
    }

    public static boolean isValidSudoku(char[][] board) {

        int[] rows = new int[9];
        int[] cols = new int[9];
        int[][] boxes = new int[3][3];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int mask = 1 << num;

                    if ((rows[i] & mask) != 0) return false;
                    rows[i] |= mask;

                    if ((cols[j] & mask) != 0) return false;
                    cols[j] |= mask;

                    if ((boxes[i/3][j/3] & mask) != 0) return false;
                    boxes[i/3][j/3] |= mask;
                }
            }
        }

        return true;


//        int boardLength = board.length;
//        HashSet<Character>[][] boxes = new HashSet[3][3];
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                boxes[i][j] = new HashSet<>();
//            }
//        }
//
//        for (int i = 0; i < boardLength; i++) {
//            HashSet<Character> rows = new HashSet<>();
//            HashSet<Character> cols = new HashSet<>();
//
//            for (int j = 0; j < boardLength; j++) {
//                if(board[i][j] != '.') {
//                    if(!rows.add(board[i][j]) || !boxes[i/3][j/3].add(board[i][j])) {
//                        return false;
//                    }
//                }
//                if(board[j][i] != '.') {
//                    if(!cols.add(board[j][i])) {
//                        return false;
//                    }
//                }
//            }
//        }
//
//        return true;
    }
}
