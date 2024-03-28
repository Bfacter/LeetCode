class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return nstairs(n, 2, dp);
    }

    private static int nstairs(int n, int k, int[] dp) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += nstairs(n - i, k, dp);
        }
        dp[n] = sum;
        return sum;
    }
}
