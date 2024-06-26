class Solution {
    private int[] dp = new int[1000];
   
    public int tribonacci(int n) {
        
        if(n==0||n==1){
            return n;
        }if(n==2){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        return dp[n];
    }
}
