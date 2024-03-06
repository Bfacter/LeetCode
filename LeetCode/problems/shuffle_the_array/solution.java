class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int[nums.length];
        int i=0;
        int j=n;
        int k =0;
        while(i<n){
            arr[k++]=nums[i++];
            arr[k++]=nums[j++];
        }
        System.gc();
        return arr;
    }
}