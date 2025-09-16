package neetCode;

// https://neetcode.io/problems/buy-and-sell-crypto?list=blind75

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        System.out.println("6 == " +
                BestTimeToBuyAndSellStock.maxProfit(new int[]{10, 1, 5, 6, 7, 1}));
        System.out.println("0 == " +
                BestTimeToBuyAndSellStock.maxProfit(new int[]{10, 8, 7, 5, 2}));
        System.out.println("8 == " +
                BestTimeToBuyAndSellStock.maxProfit(new int[]{2, 10, 1, 5}));
        System.out.println("9 == " +
                BestTimeToBuyAndSellStock.maxProfit(new int[]{2, 9, 1, 10, 0, 0, 0}));

    }

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int bestBuy = prices[0];

        for (int price : prices) {
            bestBuy = Math.min(bestBuy, price);
            maxProfit = Math.max(maxProfit, price - bestBuy);
        }

        return maxProfit;
    }

}
