class Solution {

    class Pair {
        int row, col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int[][] updateMatrix(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[][] dist = new int[n][m];
        boolean[][] vis = new boolean[n][m];

        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new Pair(i, j));
                    vis[i][j] = true;
                }
            }
        }

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while (!q.isEmpty()) {

            Pair cur = q.poll();

            for (int i = 0; i < 4; i++) {

                int newRow = cur.row + dr[i];
                int newCol = cur.col + dc[i];

                if (newRow >= 0 && newRow < n &&
                    newCol >= 0 && newCol < m &&
                    !vis[newRow][newCol]) {

                    vis[newRow][newCol] = true;
                    dist[newRow][newCol] = dist[cur.row][cur.col] + 1;

                    q.offer(new Pair(newRow, newCol));
                }
            }
        }

        return dist;
    }
}