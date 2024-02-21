class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        boolean[][] visited = new boolean[m][n];
        int[] dx = {0, 1, 0, -1}; 
        int[] dy = {1, 0, -1, 0};
        int dir = 0; 
        int i = 0, j = 0;

        while (ans.size() < m * n) {
            ans.add(matrix[i][j]);
            visited[i][j] = true;
            int ni = i + dx[dir];
            int nj = j + dy[dir];
            if (ni < 0 || ni >= m || nj < 0 || nj >= n || visited[ni][nj]) {
                dir = (dir + 1) % 4; 
                ni = i + dx[dir];
                nj = j + dy[dir];
            }
            i = ni;
            j = nj;
        }

        return ans;
    }
}
