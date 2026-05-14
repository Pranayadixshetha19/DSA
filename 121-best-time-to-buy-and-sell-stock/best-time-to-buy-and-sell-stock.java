class Solution {
    public int maxProfit(int[] prices) {
        int bp = prices[0];
        int p = 0;
        for(int i = 0; i < prices.length; i++)
        {
            if(bp > prices[i])
            {
                bp = prices[i];
            }
            p = Math.max(p, prices[i] - bp);

        }
        return p;
    }
}