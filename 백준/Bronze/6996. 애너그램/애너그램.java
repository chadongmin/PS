import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer tc = Integer.parseInt(br.readLine());

        for (int i = 0 ; i <  tc; i++){
            String str = br.readLine();
            String[] split = str.split(" ");

            List list = convertStringToList(split[0]);
            List list1 = convertStringToList(split[1]);

            if (list.equals(list1)){
                System.out.println(split[0] +" & "+split[1]+ " are anagrams.");
            }else {
                System.out.println(split[0] +" & "+split[1]+ " are NOT anagrams.");
            }
        }
    }
    private static List convertStringToList(String str) {
        List list = new ArrayList();
        char[] charArray = str.toCharArray();
        for (var c : charArray){
            list.add(c);
        }
        Collections.sort(list);
        return list;
    }
}