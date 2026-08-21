class Solution {
    public int takeCharacters(String s, int k) {
        if(k==0){
            return 0;

        }int n=s.length();
        int []freq=new int[3];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        if(freq[0]<k||freq[1]<k||freq[2]<k){
            return -1;

        }
        int left=0;
        int maxWindowSize=0;
        for(int right=0;right<n;right++){
            freq[s.charAt(right)-'a']--;
            while(freq[s.charAt(right)-'a']<k){
                 freq[s.charAt(left)-'a']++;
                 left++;
            } 
            maxWindowSize=Math.max(maxWindowSize,right-left+1);    
        }
        return n-maxWindowSize;
    }
}