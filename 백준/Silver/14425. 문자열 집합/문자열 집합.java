
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int cnt = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		int input = sc.nextInt();

		List<String> targetList = new ArrayList<>();

		for (int i = 0; i < tc; i++) {
			targetList.add(sc.next());
		}
		Collections.sort(targetList);

		for (int i = 0; i < input; i++) {
			String str = sc.next();
			if (isExist(targetList, str)) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

	static boolean isExist(List<String> list, String str) {
		int l = 0;
		int r = list.size() - 1;

		while (l <= r) {
			int m = (l + r) / 2;
			int compareResult = list.get(m).compareTo(str);

			if (compareResult < 0) {
				l = m + 1;
			} else if (compareResult > 0) {
				r = m - 1;
			} else {
				return true;
			}
		}
		return false;
	}

}
