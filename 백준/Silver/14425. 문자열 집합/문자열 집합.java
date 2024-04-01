
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		String[] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		Arrays.sort(str);

		String[] target = new String[M];
		int ans= 0;
		for (int i = 0; i < M; i++) {
			target[i] = sc.next();
			if (Arrays.binarySearch(str, target[i]) >= 0){
				ans++;
			}
		}
		System.out.println(ans);
	}

}
