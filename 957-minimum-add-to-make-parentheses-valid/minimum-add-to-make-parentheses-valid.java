class Solution {
    public int minAddToMakeValid(String s) {
        int leftCount=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                leftCount++;
            }
            else {
                if(leftCount>0){
                    leftCount--;
                }
                else{
                    count++;
                }
            }
        }
         count=count+leftCount;
         return count ;   
    }
}