class Solution {
    public String minWindow(String s, String t) {
        int m=s.length();
        int n=t.length();
        int hash[]=new int [256];
        for(int i=0;i<n;i++){
            hash[t.charAt(i)]++;

        }
        int l=0,r=0,minLen=Integer.MAX_VALUE;
        int stIdx=-1;
        int count=0;
        while(r<m){
            if(hash[s.charAt(r)]>0){
                count++;
            }
            hash[s.charAt(r)]--;
            r++;
            while(count==n){
                if(r-l<minLen){
                    minLen=r-l;
                    stIdx=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0){
                    count--;
                }
                l++;
            }
        }
        if(stIdx==-1){
            return "";
        }
        return s.substring(stIdx,stIdx+minLen);
    }
}