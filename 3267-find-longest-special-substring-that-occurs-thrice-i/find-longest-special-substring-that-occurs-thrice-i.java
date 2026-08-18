class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int[][] count = new int[26][n + 1];
        
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (right == n - 1 || s.charAt(right) != s.charAt(right + 1)) {
                int len = right - left + 1;
                int charIdx = s.charAt(left) - 'a';
                
                for (int k = 1; k <= len; k++) {
                    count[charIdx][k] += (len - k + 1);
                }

                left = right + 1;
            }
        }
        
        int maxLen = -1;
        for (int i = 0; i < 26; i++) {
            for (int len = n; len >= 1; len--) {
                if (count[i][len] >= 3) {
                    maxLen = Math.max(maxLen, len);
                    break; 
                }
            }
        }
        
        return maxLen;
    }
}