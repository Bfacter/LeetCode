class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int sum =0;
		int n =arr.length;
		int op2=0;
		int op1=0;
        int count=0;
        int min=Integer.MIN_VALUE;
	    boolean containsNegtive=false;
		for(int i =0;i<arr.length;i++) {
			sum+=arr[i];
			if(arr[i]<0) {
				containsNegtive = true;
                count++;
                min=Math.max(min,arr[i]);
			}
            
		}
		if(containsNegtive==false){
			return sum;
		}
        else if(count==n){
          return min;
        }
		else {
		op1=kadensAlgo(arr,n);
		
		for(int i =0;i<n;i++) {
			arr[i]=-1*arr[i];
		}
		int ve=kadensAlgo(arr,n);
		
		op2=sum-(-1*ve);
		
		}
		
		int ans = Math.max(op2, op1);
        return ans;
    }
    static int kadensAlgo(int[]arr,int n) {
		int max_sum=0;
		int ksum=0;
		for(int i =0;i<arr.length;i++) {
			ksum+=arr[i];
			max_sum=Math.max(max_sum, ksum);
			if(ksum<0) {
				ksum=0;
			}
		}
		return max_sum;
	}
}
