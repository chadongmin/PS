
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N+1];
		int[] acc = new int[N+1];

		int Q = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
			acc[i] = acc[i-1] ^ arr[i];
		}
		int result = 0;
		while(Q-- >0){
			int start = sc.nextInt();
			int end = sc.nextInt();

			result^= acc[end] ^ acc[start-1];

		}
		System.out.println(result);


	}
}
