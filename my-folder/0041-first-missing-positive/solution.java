class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int f = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            if (nums[i] == f) {
                f++;
            } else if (nums[i] > f) {
                return f;
            }
        }
        return f;
    }
}
