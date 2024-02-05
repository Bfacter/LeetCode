class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return binarySearc(nums,0,n-1,target);
    } 
    static int binarySearc(int[] arr, int low, int high, int a) {
	    if (low <= high) {
	        int mid = (low + high) / 2;

	        if (arr[mid] == a) {
	            return mid;
	        } else if (arr[mid] > a) {
	            return binarySearc(arr, low, mid - 1, a);
	        } else if (arr[mid] < a) {
	            return binarySearc(arr, mid + 1, high, a);
	        }
	    }

	    return -1;
	}
}

