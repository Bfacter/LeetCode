class Solution {
    public int findMaxK(int[] arr) {
        Arrays.sort(arr);
        int i =0;
        int j = arr.length-1;
        int ans=-1;
        boolean flag = false;
        while(i<j){
            if(arr[i]+arr[j]==0){
            ans = arr[j];
            flag = true;
            break;
            }
            if(arr[i]+arr[j]>0){
                j--;
            }
            if(arr[i]+arr[j]<0){
             i++;
            }
        }
        return ans;
        
    }
}
