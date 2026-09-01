public class Solution {
    public int diagonalSum(int[][] mat) {
        int res = 0, n = mat.length;

        for (int r = 0; r < n; r++) {
            res += mat[r][r];
            res += mat[r][n - r - 1];
        }

        return res - (n % 2 == 1 ? mat[n / 2][n / 2] : 0);
    }
}