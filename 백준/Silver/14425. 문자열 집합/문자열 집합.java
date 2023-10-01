
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int stringNum = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < num; i++){
            String str = sc.next();
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        int cnt = 0;
        for (int i = 0; i < stringNum; i++) {
            String target = sc.next();
            if (map.containsKey(target)) cnt++;
        }
        System.out.println(cnt);
    }
}
