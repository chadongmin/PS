
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc;i++){
            st= new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < N;j++){
                int num = Integer.parseInt(st.nextToken());
                q.add(new int[]{j, num});
            }

            int cnt =0 ;
            while(true){
                //큐 최상단에 있는 값
                int[] cur = q.poll();
                boolean check =true;

                // 큐를 순회하면서 큐 최상단 값이 자신보다 우선순위가 높은게 있는지 확인
                for (int[] c : q){
                    if (c[1] > cur[1]){
                        //큐 최상단의 값이 우선순위가 제일 높다면 break
                        check = false;
                        break;
                    }
                }
                if (check){
                    cnt++;
                    //자신이 M이 맞으면 while 문 탈출
                    if (cur[0] == M) break;
                }else{

                    //자신보다 우선순위 높은게 발견되면 큐 맨뒤에 다시 넣음
                    q.add(cur);
                }

            }
            System.out.println(cnt);
        }
    }
}
