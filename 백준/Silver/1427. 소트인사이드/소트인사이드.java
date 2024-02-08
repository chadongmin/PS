import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        List list = new ArrayList<String>();

        for (var a : input.toCharArray()){
            list.add(a);
        }

        Collections.sort(list);

        for (int i = list.size()-1; i > -1 ; i--){
            System.out.print(list.get(i));
        }
    }
}
