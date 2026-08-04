class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int lo=Integer.MAX_VALUE;
        int hi=Integer.MIN_VALUE;
        for(int num:nums){
            set.add(num);
            lo=Math.min(lo,num);
            hi=Math.max(hi,num);
        }
         List<Integer>result=new ArrayList<>();
         for(int i=lo;i<=hi;i++){
            if(!set.contains(i)){
                result.add(i);
            }
         }
         return result;
    }
}