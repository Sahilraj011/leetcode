class Solution {
    public int maximumSum(int[] arr) {
        int noDelete=arr[0];
        int oneDelete=0;
        int ans=noDelete;
        for(int i=1;i<arr.length;i++){
            int prevNoDel=noDelete;
            int prevOneDel=oneDelete;
            noDelete=Math.max(prevNoDel+arr[i],arr[i]);
            oneDelete=Math.max(prevOneDel+arr[i],prevNoDel);
            ans=Math.max(ans,Math.max(noDelete,oneDelete));
        }
        return ans;
    }
}