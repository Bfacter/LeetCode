class Solution {
    public int searchInsert(int[] nums, int target) {
        return Insert(nums,target);
    }
    public static int Insert(int[] arr,int target) {
		
		int item = target;
		int i = arr.length-1;
		while(i>=0&&arr[i]>=item) {
		
			i--;
		}
		
		i++;

		return i;
	}
}
