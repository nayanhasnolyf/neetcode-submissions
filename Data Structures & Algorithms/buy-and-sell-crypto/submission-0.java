class Solution {
    public int maxProfit(int[] prices) {
    int minsofar = prices[0];
    int currprofit = 0;
    int maxprofit= 0;
    for(int i =0 ; i<prices.length; i++)
    {
        if(prices[i]<minsofar)
        {
            minsofar=prices[i];
        }
        currprofit = prices[i]- minsofar;
        maxprofit = Math.max(currprofit,maxprofit);
    }
    return maxprofit;    
    }
}
