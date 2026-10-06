class Solution {
    public int maxRepeating(String seq, String word) {
        int ans=0;
        String temp=word;
        while(seq.contains(temp)){
            ans++;
            temp+=word;

        }
        return ans;
    }
}