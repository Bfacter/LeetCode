class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int pivot=0;
        for(int i = 0;i<n;i++){
            if(nums[i]!=val){
                nums[pivot]=nums[i];
                pivot++;
            }
    }
    return pivot;
    }
}
