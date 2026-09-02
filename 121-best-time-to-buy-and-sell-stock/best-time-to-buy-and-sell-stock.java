class Solution {
    public int maxProfit(int[] arr) {
        int buyPrice=arr[0];
        int profit=0;
        for(int i=1;i<arr.length;i++ ){
            if(buyPrice>arr[i]){
                buyPrice=arr[i];
            }
            profit=Math.max(profit,arr[i]-buyPrice);
        }
        return profit;
    }
}