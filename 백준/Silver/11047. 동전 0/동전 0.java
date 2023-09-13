
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 가장 큰 수로 뺄 수 있을 때 까지 계속 빼야 됨.
 *
 * */

public class Main {
    public static void main(String[] args) throws IOException {
        int N;
        int K;
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] =  Integer.parseInt(br.readLine());
        }
        for (int i = arr.length-1; i > -1; i--) {
            if (arr[i] <= K){
                while(arr[i] <= K){
                    K -= arr[i];
                    //System.out.println(arr[i]);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);





    }
}
