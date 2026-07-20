class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        
        // Effective shifts
        k = k % total;
        
        // Initialize result grid
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            result.add(row);
        }
        
        // Place elements in new positions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int oldIdx = (i * n) + j;
                int newIdx = (oldIdx + k) % total;
                int newR = newIdx / n;
                int newC = newIdx % n;
                result.get(newR).set(newC, grid[i][j]);
            }
        }
        
        return result;
    }
}