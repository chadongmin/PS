
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st  = new StringTokenizer(br.readLine());
//        while(st.hasMoreTokens()){
//
//        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < num;i++){
            int mem = sc.nextInt();
            map.put(mem, map.getOrDefault(mem, 0)+1);
        }

        StringBuilder sb = new StringBuilder();
        int find = sc.nextInt();
        for(int i = 0 ; i< find;i++){
            int target = sc.nextInt();
            if (map.containsKey(target)){
                sb.append(1+" ");
            }else sb.append(0+" ");
        }

        System.out.println(sb);
    }
}
