
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static boolean[][] arr;
    public static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        arr = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            String str = br.readLine();

            for (int j = 0; j < col; j++) {

                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int N_row = row - 7;
        int N_col = col - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < N_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    private static void find(int x, int y) {
        int cnt = 0;
        boolean tmp = arr[x][y];
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (arr[i][j] != tmp){
                    cnt++;
                }
                tmp = (!tmp);
            }
            tmp = (!tmp);
        }
        cnt = Math.min(cnt, 64 - cnt);

        min = Math.min(min, cnt);
    }

}
