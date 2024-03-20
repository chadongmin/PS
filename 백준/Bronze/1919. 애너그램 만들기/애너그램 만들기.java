
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		for (var s1 : str1.toCharArray()) {
			arr1[(int) s1 - 'a']++;
		}
		for (var s2 : str2.toCharArray()) {
			arr2[(int) s2 - 'a']++;
		}

		int answer = 0;
		for (int i = 0; i < 26; i++) {
			if (arr1[i] > arr2[i]) {
				answer += arr1[i] - arr2[i];
			} else if (arr2[i] > arr1[i]) {
				answer += arr2[i] - arr1[i];
			}
		}
		System.out.println(answer);
	}
}
