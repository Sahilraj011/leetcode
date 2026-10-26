class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int n=nums.length;
        int ans[]={-1,-1};
        int j=n-1;
        while(i<j){
            if(nums[i]+nums[j]==target){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(nums[i]+nums[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}