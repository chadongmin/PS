
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String bomb = br.readLine();

        int strLen = str.length();
        int bombLen = bomb.length();


        Stack<Character> st = new Stack<>();
        for (int i = 0 ; i<str.length();i++){
            st.push(str.charAt(i));

            if (st.size() >= bombLen){
                boolean flag = true;

                for (int j = 0 ; j < bombLen;j++){
                    if (st.get(st.size()-bombLen+j) != bomb.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    for (int  j = 0 ;j<bombLen;j++){
                        st.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (var s : st){
            sb.append(s);
        }
        if (sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb);
        }


    }

}
