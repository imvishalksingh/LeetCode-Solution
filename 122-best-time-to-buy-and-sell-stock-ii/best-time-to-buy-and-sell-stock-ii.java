class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int size=prices.length;
    
        
        for(int i=1; i <size ;i++){
          if(prices[i]>prices[i-1]){
            profit+=prices[i]-prices[i-1];
          }
            
        }  
        
        return profit;
    }
}