

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static int N;
    public static int M;
    public static int[] input;
    public static List<List<Integer>> resultList = new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        N=n;
        M=m;
        input = new int[N];


        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        dfs(new ArrayList<>(), 0, new boolean[N]);

        resultList.stream()
                .distinct() // 1. 중복된 리스트 제거
                .sorted((l1, l2) -> { // 2. 두 리스트(l1, l2)를 비교하는 정렬 기준 제공
                    for (int i = 0; i < M; i++) {
                        // 각 자리의 숫자를 비교해서 다르면, 그 차이를 반환 (오름차순 정렬)
                        if (l1.get(i) != l2.get(i)) {
                            return l1.get(i) - l2.get(i);
                        }
                    }
                    return 0;
                })
                .forEach(list -> { // 3. 정렬된 리스트를 하나씩 꺼내서 출력
                    for (int val : list) {
                        System.out.print(val + " ");
                    }
                    System.out.println();
                });


    }
    public static void dfs(List<Integer> list, int depth, boolean[] visited){
        if (depth == M){
            // M개를 모두 뽑았으니, 여기서 출력하고 종료해야 합니다.
            resultList.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < N; i++) {
            // i 번째 카드 쓸 수 있는지 확인
            if (!visited[i]){


                visited[i] = true;


                list.add(input[i]); // input 배열의 i번째 값을 list에 추가!


                dfs(list, depth + 1, visited);

                visited[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}