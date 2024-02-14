
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //지민이와 한수는 무조건 이김
        //다음 라운드에 진출하면 번호를 새로 배정받는데,
        //새로 배정받은 번호에서 어떻게 지민이와 한수를 식별할지가 키포인트인것같음
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();

        int cnt = 0;

        while (N != M) {
            N = (N / 2) + (N % 2);
            M = (M / 2) + (M % 2);
            cnt++;
        }
        System.out.println(cnt);


    }

}
