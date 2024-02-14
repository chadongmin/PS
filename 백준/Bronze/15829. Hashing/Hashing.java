
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    /**
     * 해시함수:
     * 임의의 길이의 입력을 받아서 고정된 출력을 내보낸다.
     */

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long M = 1234567891;
        long R =31;
        long pow = 1;

        Long len = Long.parseLong(br.readLine());
        String str = br.readLine();
        char[] charArray = str.toCharArray();
        long sum = 0;

        for (int i = 0 ; i<charArray.length;i++){
           sum += (charArray[i] - 96) * pow % M;
           pow = pow * R % M;

        }
        System.out.println(sum % M);

    }

}
