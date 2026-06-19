class Solution {
    public int helper(int []nums,int target,int lo,int hi){
        if(lo>hi)return -1;
        int mid=lo+(hi-lo)/2;
        if(nums[mid]==target)return mid;
        else if(nums[mid]>target)return helper(nums,target,lo,mid-1);
        else return helper(nums,target,mid+1,hi); 
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        return helper(nums,target,0,n-1);
    }
}
// int n=nums.length;
        // int lo=0;
        // int hi=n-1;
        // while(lo<=hi){
        //     int mid=(lo+hi)/2;
        //     if(nums[mid]==target) return mid;
        //     else if(nums[mid]<target)lo=mid+1;
        //     else hi=mid-1;
        // }
        // return -1;