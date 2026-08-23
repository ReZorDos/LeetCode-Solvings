package need_to_refact.medium._200;

public class Main200 {

    public int numIslands(char[][] grid) {
        int result = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] checked = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !checked[i][j]) {
                    result++;
                    dst(i, j, grid, checked);
                }
            }
        }
        return result;
    }

    public void dst(int m, int n, char[][] grid, boolean[][] checked) {
        if (m < 0 || m > grid.length - 1 || n < 0 || n > grid[0].length - 1) {
            return;
        }

        if (checked[m][n] || grid[m][n] == '0') {
            return;
        }

        checked[m][n] = true;

        dst(m, n - 1, grid, checked);
        dst(m - 1, n, grid, checked);
        dst(m + 1, n, grid, checked);
        dst(m, n + 1, grid, checked);
    }

}
