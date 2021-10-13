/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solution/
This one I was not able to quite solve. But here is the solution (brute force) with comments
*/

public class Solution {
   
    public int maxProfitBruteForce(int prices[]) {
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
    
    /*
    here is an optimal solution O(N). Using 2 pointers and sliding window tecnique.
    */
    
     public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        int currentProfit = 0;
        int length = prices.length;
       while(sell < length){  
           //2 pointers, 1 for current buy price, 1 for current sell price (set to 1 day after the buy price)
           //first, check if the current buy and sell prices is a profitable transaction
           if(prices[sell] > prices[buy]){
               //if so, update the current profit. 
               currentProfit = prices[sell] - prices[buy];
               //if its > max profit, update it
               if(currentProfit > maxProfit){
                   maxProfit = currentProfit;
               }
           }
           else{
               //if its not profitable we need to move the buy date up 1.
               buy = sell;
           }
           //the sell date is always incremented. We keep going until the end.
           //The buy date is only incremented if the transaction isn't profitable. 
           sell++;
       }
        return maxProfit;
    }
}
