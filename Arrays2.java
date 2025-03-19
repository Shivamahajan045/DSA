//Trapping rain water

// public class Arrays2{
//     public static int trappingRainWater(int height[]){
//         int n = height.length;
//         int leftMaxBoundary[] = new int [n];
//         leftMaxBoundary[0] = height[0];
//         for(int i=1; i<n; i++){
//             leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i-1]);
//         }

//         int rightMaxBoundary[] = new int[n];
//         rightMaxBoundary[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--){
//             rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
//         }

//         //loop
//         int trappedWater = 0;
//         for(int i=0; i<n; i++){
//             int waterlevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
//             trappedWater += waterlevel - height[i];
//         }

//         return trappedWater;
//     }
//     public static void main(String[] args){
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.println(trappingRainWater(height));
//     }
// }

//Buy and sell stocks

import java.util.*;
public class Arrays2{
    // public static int buyAndSellStock(int prices[]){
    //     int maxProfit = Integer.MIN_VALUE;
    //     int n = prices.length;
    //     int min = prices[0];
    //     for(int i=1; i<n; i++){
    //         int cost = prices[i] - min;
    //         maxProfit = Math.max(maxProfit, cost);
    //         min = Math.min(min, prices[i]);
    //     }
    //     return maxProfit;
    // }

    public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;
        for(int i=1; i<n; i++){
            if(buyPrice < prices[i]){  //profits
                int profit = prices[i] - buyPrice;  //today profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }    
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStock(prices));
    }
}