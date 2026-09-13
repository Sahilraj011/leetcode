class Solution {
    public int maxScore(int[] nums, int k) {
        int lSum=0,rSum=0;
        int maxSum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            lSum=lSum+nums[i];
            maxSum=lSum;
        }
        int rightIdx=n-1;
        for(int i=k-1;i>=0;i--){
            lSum=lSum-nums[i];
            rSum=rSum+nums[rightIdx];
            rightIdx--;
            maxSum=Math.max(maxSum,lSum+rSum);
        }
        return maxSum;
    }
}