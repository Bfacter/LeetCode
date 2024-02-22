class Solution {
    public int findJudge(int n, int[][] trust) {
        int []data= new int[n+1];
        Arrays.fill(data,0);
        for(int[]x:trust){
            data[x[0]]--;
            data[x[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            int x = data[i];
            if (x == n - 1) {
                return i;
            }
        }
        return -1;

    }
}
