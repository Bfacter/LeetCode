class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        //   if(k<nums.length){
        // j = nums.length-k;}
        // else{
        // j = k - nums.length;
        // }
        // int []arr= new int[nums.length];
        //  int i =0;
       
        //  for(int f =j;f<nums.length;f++){
        //     arr[i]=nums[f];
        //     i++;
        //  }
        //  for(int f =0;f<j;f++){
        //     arr[i]=nums[f];
        //     i++;
        //  }
        //  for(int o = 0;o<nums.length;o++){
        //     nums[o]=arr[o];
        //  }
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
    }
    void reverse(int[] nums,int i,int j){   
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    void swap(int[] nums,int i,int j){   
        int temp =nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
