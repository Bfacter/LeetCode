class Solution {
    
    private static Integer[][] dp=new Integer[1001][1001];
    public int kInversePairs(int n, int k) {
        if(n==0) return 0;
        if(k==0) return 1;
        if(dp[n][k]!=null) return dp[n][k];
        int count=0;
        for(int i =0;i<=Math.min(k,n-1);i++){
           count= (count+kInversePairs(n-1,k-i))%1_000_000_007;
        }
        dp[n][k]=count;
        return dp[n][k];
    }
}
