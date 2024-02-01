class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> ansList=new ArrayList<>();
        for(int i =0;i<nums.length-1;i+=3){
            if(nums[i+2]-nums[i]>k){
                return new int[][]{};
            }
            ansList.add(new int[]{nums[i],nums[i+1],nums[i+2]});
        }
        int[][] ans = new int[ansList.size()][3];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }
}