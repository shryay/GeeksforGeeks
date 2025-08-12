class Solution {
    // Function to find all possible paths
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        int n = maze.length;
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
        return res;
        boolean[][] visited = new boolean[n][n];
        dfs(0, 0, maze, n, visited, "", res);
        return res;
    }
    private void dfs(int x, int y, int[][] maze, int n, boolean[][] visited, String path, ArrayList<String> res) {
        if (x == n - 1 && y == n - 1) {
            res.add(path);
            return;
        }
        visited[x][y] = true;
        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isSafe(nx, ny, maze, visited, n)) {
                dfs(nx, ny, maze, n, visited, path + dir[i], res);
            }
        }
        visited[x][y] = false;
    }
    private boolean isSafe(int x, int y, int[][] maze, boolean[][] visited, int n) {
        return (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1 && !visited[x][y]);
    }
}