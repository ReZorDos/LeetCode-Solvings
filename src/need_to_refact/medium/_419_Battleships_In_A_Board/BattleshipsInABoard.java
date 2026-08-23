package need_to_refact.medium._419_Battleships_In_A_Board;

public class BattleshipsInABoard {
    public static void main(String[] args) {

    }

    public int countBattleships(char[][] board) {
        int count = 0;
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'X' && !visited[i][j]) {
                    count++;
                    dfs(i, j, board, visited);
                }
            }
        }
        return count;
    }

    private void dfs(int m, int n, char[][] board, boolean[][] visited) {
        if (m < 0 || m > board.length-1 || n < 0 || n > board[0].length-1 ) {
            return;
        }

        if (board[m][n] != 'X' || visited[m][n]) {
            return;
        }

        visited[m][n] = true;

        dfs(m + 1, n, board, visited);
        dfs(m - 1, n, board, visited);
        dfs(m, n + 1, board, visited);
        dfs(m, n - 1, board, visited);
    }
}
