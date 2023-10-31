
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] board = new int[n][m];

        for (int i = 0 ; i < n;i++){
            String str = sc.next();
            for(int j = 0 ; j < m;j++){
                board[i][j]  =str.charAt(j) - '0';
            }
        }

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<int[]> Q = new LinkedList<>();
        Q.offer(new int[]{0,0});
        int L =1;
        while(!Q.isEmpty()){
            int size = Q.size();
            for (int  i = 0 ; i<size;i++ ) {
                int[] p = Q.poll();
                if (p[0] == n-1 && p[1] == m-1) {
                    System.out.println(L);
                    return;
                }
                for (int k = 0; k < 4; k++) {
                    int nx = p[0] + dx[k];
                    int ny = p[1] + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 1) {
                        board[nx][ny] = 0;
                        Q.offer(new int[]{nx, ny});
                    }
                }
            }
            L++;
        }
    }
}
