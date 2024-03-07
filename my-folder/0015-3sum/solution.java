class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);
		int n = a.length;
		for (int i = 0; i < a.length; i++) {
            
			if(i>0&&a[i]==a[i-1]) {
				continue;
			}
			int j = i+1;
			int k =n-1;
			while(j<k){
				int [] a1 = new int[3];
				if(a[i]+a[j]+a[k]==0) {
                    List<Integer> andar = new ArrayList<>();
					andar.add(a[i]);
					andar.add(a[j]);
					andar.add(a[k]);
                    ans.add(andar);
					j++;
					k--;
					while(j<k&&a[j]==a[j-1]) {
						j++;
					}
					while(j<k&&a[k]==a[k+1]) {
						k--;
					}
                    
				}
				else if(a[i]+a[j]+a[k]>0) {
					k--;
				}else {
					j++;
				}
				
			}
		}
		return ans;   
    }
}
