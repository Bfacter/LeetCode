class Solution {
    public int trap(int[] height) {
        return Water(height);
    }
    public static int Water(int[] arr) {
	int count = 0;
	int [] left = new int[arr.length];
	left[0]=arr[0];
	for(int i =1; i<left.length;i++){
		left[i]=Math.max(left[i-1], arr[i]);
	}
	int[] right = new int[arr.length];
	right[arr.length-1]=arr[arr.length-1];
	for(int j=arr.length-2;j>=0;j--) {
		right[j]=Math.max(right[j+1],arr[j]);
	}
	for(int k = 0;k<arr.length;k++) {
		count+=Math.min(left[k],right[k])-arr[k];
	}
	return count;
	
}
}