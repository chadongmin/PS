import java.util.*;
class Solution {
    public static int solution(int[][] maps) {
        int yLen = maps.length;
        int xLen = maps[0].length;
        int[][] visited = new int[yLen][xLen];

        // 동(→), 북(↑), 서(←), 남(↓)
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        visited[0][0] = 1; // 시작점 거리 = 1

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int y = now[0];
            int x = now[1];

            for (int i = 0; i < 4; i++) {
                int nextY = y + dy[i];
                int nextX = x + dx[i];

                // 맵 범위 벗어나면 skip
                if (nextX < 0 || nextX >= xLen || nextY < 0 || nextY >= yLen) continue;
                // 벽이거나 이미 방문했다면 skip
                if (maps[nextY][nextX] == 0 || visited[nextY][nextX] != 0) continue;

                // 다음 위치 방문 처리
                visited[nextY][nextX] = visited[y][x] + 1;
                queue.add(new int[]{nextY, nextX});
            }
        }

        int result = visited[yLen - 1][xLen - 1];
        return result == 0 ? -1 : result;
    }
       
}