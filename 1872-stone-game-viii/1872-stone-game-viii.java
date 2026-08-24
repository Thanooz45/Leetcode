class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;

        // Compute prefix sums in-place
        int[] prefix = new int[n];
        prefix[0] = stones[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + stones[i];
        }

        // dp tracks the maximum score difference from index i to n - 1
        int dp = prefix[n - 1];

        // Iterate backwards from the second-to-last valid move down to index 1 (x >= 2)
        for (int i = n - 2; i >= 1; i--) {
            dp = Math.max(dp, prefix[i] - dp);
        }

        return dp;
    }
}