import java.util.*;
class Solution {
    public static int solution(int[][] maps) {

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int row = maps.length;
        int column = maps[0].length;
        int[][] result = new int[row][column];

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        result[0][0] = 1;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            for (int i = 0; i < 4; i++) {
                int x = dx[i] + now[0];
                int y = dy[i] + now[1];

                if (x >= row || x < 0 || y >= column || y < 0) {
                    continue;
                }
                if (maps[x][y] == 0) {
                    continue;
                }
                if (result[x][y] == 0) {
                    q.add(new int[]{x, y});
                    result[x][y] = result[now[0]][now[1]] + 1;
                }
            }

        }
        if (result[row - 1][column - 1] == 0) return -1;
        return result[row - 1][column - 1];
    }
}