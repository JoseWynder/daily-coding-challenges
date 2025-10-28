package leetCode;

// https://leetcode.com/problems/min-cost-climbing-stairs/description/

public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        for (int i = cost.length - 3; i >= 0; i--) {
            cost[i] += Math.min(cost[i + 1], cost[i + 2]);
        }

        return Math.min(cost[0], cost[1]);
    }

    public static void main(String[] args) {
        System.out.println("1 == " + minCostClimbingStairs(new int[]{1,2}));
        System.out.println("2 == " + minCostClimbingStairs(new int[]{1,2,3}));
        System.out.println("2 == " + minCostClimbingStairs(new int[]{0,1,2,2}));
        System.out.println("4 == " + minCostClimbingStairs(new int[]{1,2,1,2,1,1,1}));
        System.out.println("6 == " + minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));

    }
}
