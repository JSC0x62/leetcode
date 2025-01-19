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
    updated to be more readable
    */
    
     public int maxProfit(int[] prices) {

        //1) use a left (buy) pointer and right (sell) pointer. l = 0 r = 1
        
        int l = 0;
        int r = 1;
        int profit = 0;
        int maxProfit = 0;

        while(r < prices.length){
           //2) if l < r (buy < sell) - calculate profit
            if(prices[l] < prices[r]){
                profit = prices[r] - prices[l];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
            else{
               //3) else move left pointer to where right is
                l = r;   
            }
           //4) shift right pointer (always will shift by 1 to iterate through the array)
            r++;
        }
        return maxProfit;       
    }
}
