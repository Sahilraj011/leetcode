class Solution {
    public int findMin(int[] arr) {
        int lo=0;
        int n=arr.length;
        int hi=n-1;
        int min=Integer.MIN_VALUE;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]<=arr[hi]){
                hi=mid;
            }else{
                lo=mid+1;
            }
        }
        return arr[lo];
    }
}