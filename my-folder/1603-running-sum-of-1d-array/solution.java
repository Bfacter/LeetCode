class Solution {
    public int[] runningSum(int[] nums) {
        int n =nums.length;
        int [] arr = new int[n];
        arr[0]=nums[0];
        for(int i =1;i<arr.length;i++){
            arr[i]=nums[i]+arr[i-1];
        }
        return arr;
    }
}
