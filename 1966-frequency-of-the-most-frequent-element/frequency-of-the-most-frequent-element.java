class Solution {
    public int maxFrequency(int[] nums, int k) {
                Arrays.sort(nums);
        
        long total = 0;
        int left = 0;
        int maxFreq = 0;
        
        for (int right = 0; right < nums.length; right++) {
            total += nums[right];
            long target = nums[right];
            long windowLength = right - left + 1;
            while (target * windowLength - total > k) {
                total -= nums[left];
                left++;
                windowLength = right - left + 1;
            }
            
            maxFreq = Math.max(maxFreq, (int)windowLength);
        }
        
        return maxFreq;

    }
}