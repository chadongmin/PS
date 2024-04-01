
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int targetNum = sc.nextInt();
			int result = Arrays.binarySearch(arr, targetNum);
			System.out.println(result >= 0 ?1 : 0);
		}


	}

}
