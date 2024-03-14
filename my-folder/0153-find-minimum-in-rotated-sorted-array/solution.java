class Solution {
    public int findMin(int[] nums) {
        int s = findPiv(nums,nums.length);
        return nums[s];
    }
    static int findPiv(int[] arr, int n) {
        int s = 0;
        int e = n - 1;
        if(arr[s]<=arr[e]) {
        	return 0;
        }
        // if(arr[s]>arr[e]){
        //     return e;
        // }
        while (s <= e) {
            int m = s+(e - s) / 2;
            if (m - 1 >= 0 && arr[m] < arr[m-1]) {
                return m%n ;
            } if (arr[e] <= arr[m]) {
                s = m+1 ;
            } else {
                e = m ;
            }
        }
        return s%n ;
    }
}
