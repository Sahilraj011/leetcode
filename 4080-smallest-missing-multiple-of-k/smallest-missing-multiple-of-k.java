class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[]contain=new boolean[201];
        for(int ele:nums){
            contain[ele]=true;
        }
        int ans=k;
        while(contain[ans]){
            ans+=k;
        }
        return ans;
    }
}