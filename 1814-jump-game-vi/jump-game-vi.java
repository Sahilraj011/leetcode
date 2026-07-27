class Solution {
    public int maxResult(int[] nums, int k) {
         int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        
        // Deque stores indices, ordered by dp value descending
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerLast(0);
        
        for (int i = 1; i < n; i++) {
            // 1. Remove indices out of window [i-k, i-1]
            if (!deque.isEmpty() && deque.peekFirst() < i - k) {
                deque.pollFirst();
            }
            
            // 2. Calculate dp[i] using the max from the window (front of deque)
            dp[i] = nums[i] + dp[deque.peekFirst()];
            
            // 3. Maintain monotonicity: remove elements smaller than current dp[i]
            while (!deque.isEmpty() && dp[deque.peekLast()] <= dp[i]) {
                deque.pollLast();
            }
            
            // 4. Add current index
            deque.offerLast(i);
        }
        
        return dp[n - 1];
    }
}