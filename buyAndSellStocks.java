public class buyAndSellStocks {
    public static int maxProfit(int num[]){   //time complexity is O(n)
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit = 0;
        for(int i=0; i<num.length; i++){
            if(buyPrice < num[i]){
                profit = num[i] - buyPrice;
            }
            else{
                buyPrice = num[i]; 
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println("maximum profit uptil now is: " + maxProfit(prices));
    }
}