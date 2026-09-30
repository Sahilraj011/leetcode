class Solution {
    public int countSubstrings(String s) {
        int n= s.length();
        int count=0;
        for(int i=0;i<n;i++){
            count++;
        }
        for(int i=0;i<n;i++){
            int l=i-1;
            int r=i+1;
            while(l>=0&&r<n){
                if(s.charAt(l)==s.charAt(r)){
                    count++;
                    l--;
                    r++;
                }else{
                    break;
                }
            }
        }
        for(int i=0;i<n-1;i++){
            int l=i;
            int r=i+1;
            while(l>=0&&r<n){
                if(s.charAt(l)==s.charAt(r)){
                    count++;
                    l--;
                    r++;
                }else break;
            }
        }
        return count;
    }
}