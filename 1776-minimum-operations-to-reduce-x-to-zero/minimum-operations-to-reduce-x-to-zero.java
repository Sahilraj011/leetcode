class Solution {
    public int minOperations(int[] nums, int targetSum) {
        int totalSum=Arrays.stream(nums).sum();
        int target=totalSum-targetSum;
        if(target<0){
            return -1;

        }
        if(target==0){
            return nums.length;

        }
        int n=nums.length;
        int minOperation=Integer.MAX_VALUE;
        int currentSum=0;
        int leftIndex=0,rightIndex=0;
        while(rightIndex<n){
            currentSum+=nums[rightIndex];
            rightIndex++;
            while(currentSum>target&&leftIndex<n){
                currentSum-=nums[leftIndex];
                leftIndex++;
            }
            if(currentSum==target){
                minOperation=Math.min(minOperation,n-(rightIndex-leftIndex));
            }
        }
        return (minOperation==Integer.MAX_VALUE)?-1:minOperation;
    }
}