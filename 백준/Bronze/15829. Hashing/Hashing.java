
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    /**
     * 해시함수:
     * 임의의 길이의 입력을 받아서 고정된 출력을 내보낸다.
     */

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] charArray = str.toCharArray();
        double sum = 0;

        for (int i = 0 ; i<charArray.length;i++){
            int num = (int)charArray[i] -96;
            double pow = Math.pow(31, i);
//            System.out.println("num = " + num);
//            System.out.println("pow = " + pow);
            sum += (num * pow);
        }
        System.out.println((int)sum % 1234567891);
    }

}
