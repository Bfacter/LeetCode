class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        
       return f(0,arr,k,dp);
    }
    static int f(int idx,int[]arr,int p,int [] dp){
        if(idx==arr.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int m =arr.length;
        int len =0;
        int maxi=Integer.MIN_VALUE;;
        int maxAns=Integer.MIN_VALUE;
        for(int i=idx;i<Math.min(idx+p,m);i++){
            len++;
            maxi=Math.max(maxi,arr[i]);
            int sum = len*maxi+ f(i+1,arr,p,dp);
            maxAns=Math.max(maxAns,sum);
            dp[idx]=maxAns;
        }
        return dp[idx];
    }
}