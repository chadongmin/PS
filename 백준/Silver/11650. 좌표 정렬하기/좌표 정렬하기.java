import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < tc; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            List<Integer> point = new ArrayList<>();
            point.add(x);
            point.add(y);
            list.add(point);
        }

        Collections.sort(list, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(0).equals(o2.get(0))) {
                    return o1.get(1) - o2.get(1);
                }
                return o1.get(0) - o2.get(0);
            }
        });

        for (List<Integer> l : list) {
            System.out.println(l.get(0) + " " + l.get(1));
        }
    }
}
