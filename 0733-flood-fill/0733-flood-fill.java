class Solution {

    int[][] dir = {
        {1, 0},
        {-1, 0},
        {0, 1},
        {0, -1}
    };

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int original = image[sr][sc];

        if (original == color)
            return image;

        dfs(image, sr, sc, original, color);

        return image;
    }

    private void dfs(int[][] image, int r, int c, int original, int color) {

        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length)
            return;

        if (image[r][c] != original)
            return;

        image[r][c] = color;

        for (int[] d : dir) {
            dfs(image, r + d[0], c + d[1], original, color);
        }
    }
}