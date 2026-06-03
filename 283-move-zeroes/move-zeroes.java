class Solution {
    public void moveZeroes(int[] nums) {
        int writePtr=0;
        for(int readPtr=0;readPtr<nums.length;readPtr++){
            if(nums[readPtr]!=0){
                int temp=nums[writePtr];
                nums[writePtr]=nums[readPtr];
                nums[readPtr]=temp;
                writePtr++;
            }
        }
    }
}