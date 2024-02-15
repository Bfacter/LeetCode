class Solution {
    public long largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        long sum =0;
        for(int i:nums){
            sum+=i;
        }
        for(int j=n-1;j>=2;j--){
            sum=sum-nums[j];
            if(sum>nums[j]){
                return sum+nums[j];
            }
        }
        return -1;
    }
}