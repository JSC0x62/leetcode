/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solution/
This one I was not able to quite solve. But here is the solution (brute force) with comments
*/

public class Solution {
    public int maxProfit(int prices[]) {
        //this variable keeps track of the current max profit while in the loop
        int maxprofit = 0;
        //iterate through each element in the array
        for (int i = 0; i < prices.length - 1; i++) {
            //compare each of the rest of the elements to i. Simillar to two sum problem. Basically comparing each element against each other.
            for (int j = i + 1; j < prices.length; j++) {
                //the profit is value of day its sold - value of day its bought
                int profit = prices[j] - prices[i];
                //if we get a value > current maxprofit, update it. At the end return it.
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
}
