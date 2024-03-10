class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int n = Math.max(nums1.length, nums2.length);
        int[] ans = new int[n];
        int index = 0; 
        int lastAdded = Integer.MIN_VALUE;
        while (i < nums1.length && j < nums2.length) {
           if (nums1[i] == nums2[j]) {
                if (nums1[i] != lastAdded) {
               
                    ans[index++] = nums1[i];
                    lastAdded = nums1[i]; 
                }
               
                i++;
                j++;
            }else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(ans, index);
    }
}
