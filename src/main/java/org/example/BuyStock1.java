package org.example;

public class BuyStock1 {
    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int right=0;right<prices.length;right++){
            if(prices[right]<minPrice) minPrice = prices[right];
            else if(maxProfit<prices[right]-minPrice){
                maxProfit = prices[right] - minPrice;
            }
        }
        return maxProfit;
    }

    // WOLNE O(n^2)
//    public static int maxProfit(int[] prices) {
//        int maxProfit = 0;
//
//        for(int i=0;i<prices.length-1;i++){
//            for(int k = i+1;k<prices.length;k++){
//                if(prices[k]-prices[i] > maxProfit)
//                    maxProfit= prices[k]-prices[i];
//            }
//        }
//        return maxProfit;
//    }
}
