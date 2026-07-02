import java.util.*;

class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        int m = grid.size();
        int n = grid.get(0).size();

        int[][] mat = new int[m][n];

        // Convert List<List<Integer>> to int[][]
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = grid.get(i).get(j);
            }
        }

        int[][] dist = new int[m][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        int[][] dir = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        dist[0][0] = mat[0][0];
        pq.offer(new int[]{mat[0][0], 0, 0});

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();

            int cost = curr[0];
            int x = curr[1];
            int y = curr[2];

            if (cost > dist[x][y]) continue;

            if (x == m - 1 && y == n - 1) {
                return cost < health;
            }

            for (int[] d : dir) {

                int r = x + d[0];
                int c = y + d[1];

                if (r < 0 || r >= m || c < 0 || c >= n)
                    continue;

                int newCost = cost + mat[r][c];

                if (newCost < dist[r][c]) {
                    dist[r][c] = newCost;
                    pq.offer(new int[]{newCost, r, c});
                }
            }
        }

        return false;
    }
}