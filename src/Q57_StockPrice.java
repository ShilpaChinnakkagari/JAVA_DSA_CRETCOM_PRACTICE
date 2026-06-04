/*
Problem Statement: Best Time to Buy and Sell Stock

You are given an array arr of n integers, where arr[i] represents
the price of a stock on the i-th day.

Your task is to determine the maximum profit you can achieve
by buying the stock on one day and selling it on a later day.

Rules:
- You must buy before you sell.
- You cannot buy and sell on the same day.
- If no profit is possible, return 0.

Example 1:
Input  : arr = [10, 7, 5, 8, 11, 9]
Output : 6
Explanation:
Buy at price 5 (day 3) and sell at price 11 (day 5), profit = 11 - 5 = 6.

Example 2:
Input  : arr = [5, 4, 3, 2, 1]
Output : 0
Explanation:
No profitable transaction is possible.

Constraints:
1 <= n <= 10^5
0 <= arr[i] <= 10^6
*/


class Q57_StockPrice {

    public static void meth(int[] arr) {
        int n = arr.length;

        int bestpurch = arr[0];   // minimum price so far (buy)
        int bestsell = arr[0];    // sell price corresponding to max profit
        int maxProfit = 0;        // max profit

        for(int i = 1; i < n; i++) {

            // If selling today gives better profit, update maxProfit
            if(arr[i] - bestpurch > maxProfit) {
                maxProfit = arr[i] - bestpurch;
                bestsell = arr[i];  // update sell price
            }

            // Update minimum price so far
            if(arr[i] < bestpurch) {
                bestpurch = arr[i];
            }
        }

        System.out.println("Buy at  : " + bestpurch);
        System.out.println("Sell at : " + bestsell);
        System.out.println("Profit  : " + maxProfit);
    }

    public static void main(String[] args) {
        int[] arr = {10,6,5,8,11,9};
        meth(arr);
    }
}

/*
Time Complexity  : O(n)
Space Complexity : O(1)
*/