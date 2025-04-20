class Solution {
    static int[][] computer;
    static boolean[] visited;
    public int solution(int n, int[][] computers) {
        int result = 0;
        visited = new boolean[n];
        computer = computers;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                result++;
            }

        }

        return result;
    }

    public static void dfs(int now) {
        visited[now] = true;
        for (int i = 0; i < computer[now].length; i++) {
            if (computer[now][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
    
}