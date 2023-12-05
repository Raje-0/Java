package arrayQuestion2;

public class A17_bestTimeToBuyAndSellStock {
	  public static int maxProfit(int[] prices) {
	        if (prices == null || prices.length <= 1) {
	            return 0; // No profit can be made with less than two prices
	        }

	        int maxProfit = 0;
	        int buyPrice = prices[0];

	        for (int i = 1; i < prices.length; i++) {
	            int currentPrice = prices[i];
	            int profit = currentPrice - buyPrice;

	            // Update max profit if the profit is greater
	            if (profit > maxProfit) {
	                maxProfit = profit;
	            }

	            // Update buy price if the current price is smaller
	            if (currentPrice < buyPrice) {
	                buyPrice = currentPrice;
	            }
	        }

	        return maxProfit;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int[] prices = {7, 1, 5, 3, 6, 4};
	        int result = maxProfit(prices);
	        System.out.println("Maximum Profit: " + result);
	    }
}
