class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
     int pivot = 0;
        for (int i = 0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[pivot]=nums[i];
                pivot++;
            }
            
        }
        nums[pivot]=nums[n-1];
        pivot++;
        return pivot;
        }
       
    }
    

