
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 어떻게 파싱을 해야할지가 관건인 문제
 * 연산자는 -, + 둘 밖에 없다.
 * 일단 문자열이라서
 * */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] minus = str.split("-");
        int tmp =0;
        for (int i = 0; i < minus.length; i++) {
            int sum = 0;
            String[] plus = minus[i].split("\\+");
            for (int j = 0; j < plus.length; j++) {
                sum += Integer.parseInt(plus[j]);
            }
        
            if (i == 0){
                //System.out.println(sum);
                tmp += sum;
            }else {
                //System.out.println(sum);
                tmp -=sum;
            }
        }
        System.out.println(tmp);


    }
}
