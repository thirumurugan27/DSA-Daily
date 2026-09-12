class Solution {
    public int minimumOperationsToWriteY(int[][] grid) {

        int n = grid.length;
        int mid = n / 2;

        int[][] notYCount = new int[3][2];
        int[][] yCount = new int[3][2];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                int num = grid[r][c];

                if ((c == mid && r >= mid) ||
                    (r == c && r <= mid) ||
                    (c == n - r - 1 && r <= mid)) {

                    yCount[num][0]++;
                } else {
                    notYCount[num][0]++;
                }
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int y = 0; y < 3; y++) {
            for (int notY = 0; notY < 3; notY++) {

                if (y == notY)
                    continue;

                int operations =
                    (yCount[0][0] + yCount[1][0] + yCount[2][0] - yCount[y][0])
                    +
                    (notYCount[0][0] + notYCount[1][0] + notYCount[2][0] - notYCount[notY][0]);

                ans = Math.min(ans, operations);
            }
        }

        return ans;
    }
}