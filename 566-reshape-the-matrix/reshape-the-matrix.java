class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] res = new int[r][c];

        for (int idx = 0; idx < m * n; idx++) {

            res[idx / c][idx % c] =
                mat[idx / n][idx % n];
        }

        return res;
    }
}