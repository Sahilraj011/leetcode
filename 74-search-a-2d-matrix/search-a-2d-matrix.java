class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int rows =arr.length,cols=arr[0].length;
        int lo=0,hi=rows*cols-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int midRow=mid/cols,midCol=mid%cols;
            if(arr[midRow][midCol]==target)return true;
            else if(arr[midRow][midCol]>target)hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
}