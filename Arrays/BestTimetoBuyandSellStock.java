package Arrays;

public class BestTimetoBuyandSellStock 
{
	public int maxProfit(int[] prices) 
    {
        int buy = prices[0];
        int max_profit = 0;
        int len = prices.length;
        
        for(int i=1; i<len ; i++)
        {
            if(buy > prices[i])
               buy = prices[i];
            
            else if(prices[i]-buy > max_profit)
               max_profit = prices[i] - buy;
        }
        return max_profit;
    }
}
