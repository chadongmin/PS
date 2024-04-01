

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		//TODO : A+ B + C = X를 만족하는 것이 아닌, A + B = X - C를 만족하는 것을 찾자

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				set.add(arr[i] + arr[j]);
			}
		}

		int[] array = set.stream().mapToInt(Integer::intValue).sorted().toArray();

		int ans = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int target = arr[i] - arr[j];
				if (set.contains(target)){
					ans = Math.max(ans, arr[i]);
				}
			}
		}
		System.out.println(ans);
	}

}
