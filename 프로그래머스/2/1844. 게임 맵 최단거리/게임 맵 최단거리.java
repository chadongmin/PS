import java.util.*;
class Solution {
       public static int solution(int[][] maps) {

        int row = maps.length; //세로길이
        int col = maps[0].length; //가로 길이

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        int[][] result = new int[row][col];

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        result[0][0] = 1;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            for (int i = 0; i < 4; i++) {
                int c = now[1] + dx[i];
                int r = now[0] + dy[i];


                if (c >= col || c < 0 || r >= row || r < 0) {
                    continue;
                }
                if (maps[r][c] == 0) {
                    continue;
                }
                if (result[r][c] == 0) {
                    q.add(new int[]{r, c});
                    result[r][c] = result[now[0]][now[1]] + 1;
                }
            }
        }

        if (result[row - 1][col - 1] == 0) {
            return -1;
        }
        return result[row - 1][col - 1];
    }
}