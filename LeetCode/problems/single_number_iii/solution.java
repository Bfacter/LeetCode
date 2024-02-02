class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int res =0;
        for(int i =0;i<n;i++){
           res = res^nums[i];
        }
        res = (res & -res);
        int s1=0;
        int s2=0;
        for(int i=0;i<n;i++){
            if((res&nums[i])>0){
                s1=s1^nums[i];
            }
            else{
                s2=s2^nums[i];
            }
        }
        return new int[]{s1,s2};
    }
}