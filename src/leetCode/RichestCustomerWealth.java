package leetCode;

// https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int sum = 0;
            for (int bank : customer) {
                sum += bank;
            }
            maxWealth = Math.max(maxWealth, sum);
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        System.out.println("6 == "
                + maximumWealth(new int[][]{{1,2,3}, {3,2,1}}));
        System.out.println("10 == "
                + maximumWealth(new int[][]{{1,5}, {7,3}, {3,5}}));
        System.out.println("17 == "
                + maximumWealth(new int[][]{{2,8,7}, {7,1,3}, {1,9,5}}));
    }
}
