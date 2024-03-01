class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int cnt=0;
        for(int n:nums){
            if(n==1){
                cnt++;
                max=Math.max(max,cnt);
            }else{
                cnt=0;
            }
        }
        return max;
        
    }
}
