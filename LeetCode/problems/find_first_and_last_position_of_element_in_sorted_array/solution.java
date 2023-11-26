class Solution {
    public int[] searchRange(int[] nums, int target) {
        int x=-1;
        int y=-1;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[j]==target){
                   y=j;
                   }
                
            }
            if(nums[i]==target){
                x=i;
                break;}
            

        }
     
        return new int[]{x, y};
    }
}