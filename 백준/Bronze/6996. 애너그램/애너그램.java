
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.swing.plaf.IconUIResource;

public class Main {

    public static void main(String[] args)throws IOException {
        int tmp1=0;
        int tmp2=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer tc = Integer.parseInt(br.readLine());

        for (int i = 0 ; i <  tc; i++){
            String str = br.readLine();
            String[] split = str.split(" ");

            List list = new ArrayList();
            char[] charArray = split[0].toCharArray();
            for (var c : charArray){
                list.add(c);
            }
            Collections.sort(list);

            List list1 = new ArrayList();
            char[] charArray1 = split[1].toCharArray();
            for (var c : charArray1){
                list1.add(c);
            }
            Collections.sort(list1);

            if (list.equals(list1)){
                System.out.println(split[0] +" & "+split[1]+ " are anagrams.");
            }else {
                System.out.println(split[0] +" & "+split[1]+ " are NOT anagrams.");
            }

        }
    }


}
