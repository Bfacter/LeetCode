class Solution {
    public int maxArea(int[] height) {
        return mostWater(height,0,height.length-1,0);
    }
    static int mostWater(int [] arr,int left,int right,int ans){
        if(left>=right){
            return ans;
        }
        int area= Math.min(arr[left],arr[right])*(right-left);
        ans = Math.max(area,ans);
        if(arr[left]<arr[right]){
         return mostWater(arr, left + 1, right, ans);
        } else {
            return mostWater(arr, left, right - 1, ans);
        }
    }


}
