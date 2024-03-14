class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {
        int[] csum = new int[arr.length];
        csum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            csum[i] = csum[i - 1] + arr[i];
        }

        int[] ans = new int[arr.length + 1];
        int noofSub = 0;

        for (int j : csum) {
            if (j == goal) {
                noofSub++;
            }
            if (j - goal >= 0) {
                noofSub += ans[j - goal];
            }
            ans[j]++;
        }

        return noofSub;
    }
}

