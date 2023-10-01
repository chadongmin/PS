import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int targetNum = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        for(int i = 0 ; i < num;i++){
            String pocketmon = sc.next();
            map.put(pocketmon,i+1);
            map2.put(i+1, pocketmon);
        }
//        System.out.println(map);
//        System.out.println(map2);
        for (int i = 0; i < targetNum; i++) {
            String str = sc.next();
            if (map.containsKey(str)){ //key값으로 value를 찾아야할때
                System.out.println(map.get(str));
            }else { //value값으로 key를 찾아야 할 때
                int tmp  = Integer.parseInt(str);
                System.out.println(map2.get(tmp));
            }
        }

    }
}
