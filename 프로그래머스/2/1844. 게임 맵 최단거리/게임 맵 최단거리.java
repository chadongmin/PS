import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int[][] result;

        Queue<int[]> queue = new LinkedList<>();
        int N = maps.length;
        int M = maps[0].length;

        result = new int[N][M];
        //1. 시작 노드 큐에 넣기
        queue.add(new int[]{0, 0});
        // 방문처리
        result[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            //갈 수 있는지 판단
            for (int i = 0; i < 4; i++) {
                int x = now[0] + dx[i];
                int y = now[1] + dy[i];

                if (x < 0 || y < 0 || x >= N || y >= M) {
                    continue;
                }
                if (maps[x][y] == 0) {
                    continue;
                }
                if (result[x][y] == 0) {
                    queue.add(new int[]{x, y});
                    result[x][y] = result[now[0]][now[1]] + 1;
                }
            }
        }

        return result[N - 1][M - 1] == 0 ? -1 : result[N - 1][M - 1];
    }
}