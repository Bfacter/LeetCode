class Solution {
    public int findNumbers(int[] nums) {
        return NoOfevenno(nums);
    }
    static int NoOfevenno(int[]arr){
        int n=0;
        if(arr.length==0){
            return -1;
        }
        for(int i =0;i<arr.length;i++){
           int digit=(int)Math.log10(arr[i]) + 1;
            if(digit%2==0){
                n++;
            }
        }
        return n;
    }
}
