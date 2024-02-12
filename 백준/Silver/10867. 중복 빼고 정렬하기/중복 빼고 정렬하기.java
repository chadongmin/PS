
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < tc; i++) {
            int input = sc.nextInt();
            list.add(input);
        }
        Set<Integer> set = new HashSet<>(list);

        List sortedList = new ArrayList(set);


        Collections.sort(sortedList);
        for (var a : sortedList){
            System.out.print(a+" ");
        }
    }
}
