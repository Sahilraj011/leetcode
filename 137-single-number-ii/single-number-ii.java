class Solution {
    public int singleNumber(int[] nums) {
        int ones=0;
        int tows=0;
        for(int num:nums){
            ones^=(num&~tows);
            tows^=(num&~ones);
        }
        return ones;
    }
}