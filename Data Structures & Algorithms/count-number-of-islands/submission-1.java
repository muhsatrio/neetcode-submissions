// GRAPH
// Input: grid = [
//     ["0","1","1","1","0"],
//     ["0","1","0","1","0"],
//     ["1","1","0","0","0"],
//     ["0","0","0","0","0"]
//   ]
// Output: 1

class Solution {
    static class Pair {
        int y, x;

        public Pair(int y, int x) {
            this.y = y;
            this.x = x;
        }
    };

    private void fill(int y, int x, boolean[][] visited, char[][] grid, List<Pair> directions, int maxY, int maxX) {
        visited[y][x] = true;
        for (Pair dir : directions) {
            int nextY = y + dir.y;
            int nextX = x + dir.x;
            if (nextY >= 0 && nextY < maxY && nextX >= 0 && nextX < maxX && grid[nextY][nextX] == '1' && !visited[nextY][nextX]) {
                fill(nextY, nextX, visited, grid, directions, maxY, maxX);
            }
        }
    }

    public int numIslands(char[][] grid) {
        List<Pair> directions = new ArrayList<>();

        directions.add(new Pair(1, 0));
        directions.add(new Pair(-1, 0));
        directions.add(new Pair(0, 1));
        directions.add(new Pair(0, -1));

        int maxY = grid.length;
        int maxX = grid[0].length;

        boolean[][] visited = new boolean[maxY][maxX];

        int result = 0;

        for (int i=0; i<maxY; i++) {
            for (int j=0; j<maxX; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    result++;
                    fill(i, j, visited, grid, directions, maxY, maxX);
                }
            }
        }

        return result;
    }
}
