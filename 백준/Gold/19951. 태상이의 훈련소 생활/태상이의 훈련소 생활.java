
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[N + 1];
		int[] acc = new int[N + 1];

		for (int i = 1; i < N + 1; i++) {
			arr[i] = sc.nextInt();
		}

		int[] delta = new int[N+2];

		while(M-- > 0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();

			//delta[i] : [i : N] 까지 적용되는 변화량
			delta[a] += k;
			delta[b+1] -= k;
		}
		int[] accDelta = new int[N+1];
		for (int i = 1; i < N+1; i++) {
			accDelta[i] += accDelta[i-1] + delta[i];
		}
		for (int i = 1; i < N+1; i++) {
			System.out.print(arr[i]+accDelta[i]+" ");
		}
	}
}
