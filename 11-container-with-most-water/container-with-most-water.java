class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxWater=0;
        int length=0;
        while(i<j){
            int hi=Math.min(height[i],height[j]);
            length=j-i;
            int area=hi*length;
            maxWater=Math.max(area,maxWater);
            if(height[i]>height[j]){
                j--;

            }
            else{
                i++;
            }
        }
        return maxWater;
    }
}