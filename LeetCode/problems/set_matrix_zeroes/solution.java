class Solution {
    public int[][] setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[]row=new int[n];
        int[]col=new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if (row[x]==1||col[y]==1) {
                    matrix[x][y] = 0;
                }
            }
        }

        return matrix;
    }

}
