class Solution {
    public int fib(int n) {
        int [] dp = new int[n+1];
		Arrays.fill(dp, -1);
        return fibinaccci(n,dp);
    }
    static int fibinaccci(int n,int[]dp) {
		if(n==0) {
			return 0;
		}if(n==1) {
			return 1;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		dp[n]=fibinaccci(n-1,dp)+fibinaccci(n-2,dp);
		return dp[n];
	}
}
