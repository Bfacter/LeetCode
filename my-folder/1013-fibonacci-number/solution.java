class Solution {
    public int fib(int n) {
     int[]dp=new int[n+1];
    //  Arrays.fill(dp,-1);
     
       if(n<2){
           return n;
       }
       dp[n]=fib(n-1)+fib(n-2);
       return dp[n];
    }
}
