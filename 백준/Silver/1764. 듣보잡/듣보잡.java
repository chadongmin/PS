import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int cnt = 0;
        HashSet<String> Listen = new HashSet<>();

        for (int  i = 0;i<N;i++){
            Listen.add(sc.next());
        }

        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0 ;i<M;i++){
            String name = sc.next();
            //System.out.println(name);
            if (Listen.contains(name)){
                arr.add(name);
                cnt++;
            }
        }

        Collections.sort(arr);
        System.out.println(cnt);
        for (var a : arr){
            System.out.println(a);
        }

        //System.out.println(Look.get(1));

    }
}
