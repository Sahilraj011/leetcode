class Solution {
    public boolean isBalanced(String num) {
        int n=num.length();
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<n;i++){
            int digit=num.charAt(i)-'0';
            if(i%2==0){
                evenSum=evenSum+digit;
            }
            else{
                oddSum=oddSum+digit;
            }
        }
        if(evenSum==oddSum){
            return true;
        }
        return false;
    }
}