class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int maxLength=0;
        int lastZero=-1;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                left= lastZero+1;
                lastZero=right;
            }
            maxLength=Math.max(maxLength,right-left);
        }
        return maxLength;
    }
}