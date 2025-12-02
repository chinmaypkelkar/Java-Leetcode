package Array;

public class StockTest {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++){
            for(int j=1;j<prices.length;j++){
                if(prices[i] < prices[j]){
                    maxProfit = Math.max(prices[j] - prices[i], maxProfit);
                }
            }
        }

        return maxProfit;
        
    }

}
