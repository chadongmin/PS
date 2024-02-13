
import java.util.Scanner;

public class Main {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int N_row = N - 7;
        int N_col = M - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < N_col; j++) {
                find(i, j);
            }
        }

//        for (int i = 0 ; i < N ;i++){
//            for (int j = 0 ; j < M;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println(min);
    }

    private static void  find(int x, int y) {
        int cnt = 0;

        boolean init = arr[x][y];
        for (int i = x; i < x+8; i++) {
            for (int j = y; j < y+8; j++) {
                if (arr[i][j] != init){
                    cnt++;
                }
                init = (!init);
            }
            init = (!init);
        }

        cnt = Math.min(cnt, 64 - cnt);

        /*
         * 이전까지의 경우 중 최솟값보다 현재 count 값이
         * 더 작을 경우 최솟값을 갱신
         */
        min = Math.min(min, cnt);

    }

}
