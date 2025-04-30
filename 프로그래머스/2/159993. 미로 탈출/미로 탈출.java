import java.util.*;
class Solution {
    static int[] temp;

    static int[] start;
    static int[] end;

    public static int solution(String[] maps) {
        int row = maps.length;
        int col = maps[0].length();
        String[][] map = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char[] charArray = maps[i].toCharArray();
                map[i][j] = String.valueOf(charArray[j]);
                if (map[i][j].equals("S")) {
                    start = new int[]{i, j};
                }
                if (map[i][j].equals("E")) {
                    end = new int[]{i, j};
                }
            }
        }
        int[][] result = new int[row][col];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start[0], start[1]});
        result[start[0]][start[1]] = 1;

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        while (!q.isEmpty()) {
            int[] now = q.poll();
            if (map[now[0]][now[1]].equals("L")) {
                temp = new int[]{now[0], now[1]};
                break;
            }
            for (int i = 0; i < 4; i++) {
                int r = now[0] + dx[i];
                int c = now[1] + dy[i];

                if (c >= col || c < 0 || r >= row || r < 0) {
                    continue;
                }
                if (map[r][c].equals("X")) {
                    continue;
                }
                if (result[r][c] == 0) {
                    q.add(new int[]{r, c});
                    result[r][c] = result[now[0]][now[1]] + 1;
                }
            }
        }
        if (temp == null || result[temp[0]][temp[1]] == 0) {
            return -1;
        }
        Queue<int[]> q2 = new LinkedList<>();
        q2.add(new int[]{temp[0], temp[1]});
        int[][] result2 = new int[row][col];
        result2[temp[0]][temp[1]] = 1;
        while (!q2.isEmpty()) {
            int[] now = q2.poll();
            for (int i = 0; i < 4; i++) {
                int r = now[0] + dx[i];
                int c = now[1] + dy[i];

                if (c >= col || c < 0 || r >= row || r < 0) {
                    continue;
                }
                if (map[r][c].equals("X")) {
                    continue;
                }
                if (result2[r][c] == 0) {
                    q2.add(new int[]{r, c});
                    result2[r][c] = result2[now[0]][now[1]] + 1;
                }
            }
        }
        if (result2[end[0]][end[1]] == 0) {
            return -1;
        }
        return (result[temp[0]][temp[1]] - 1) + (result2[end[0]][end[1]] - 1);
    }
}