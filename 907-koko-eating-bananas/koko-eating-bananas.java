class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low=1;
       int high=0;
       for(int pile:piles){
        high=Math.max(high,pile);
       } 
       while(low<=high){
            long hours=0;
            int mid=low+(high-low)/2;
            for(int i=0;i<piles.length;i++){
                hours+=(piles[i]+mid-1)/mid;
            }
            if(hours<=h){
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return low;
    }
}