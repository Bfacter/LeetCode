class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int n = accounts.length;
        int m = accounts[0].length;
        int i =0;
        int max = 0;
        int sum =0;
        while(i<n){
            for(int j =0;j<m;j++){
           sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
            i++;
            sum=0;
        }
        return max;
    }
}