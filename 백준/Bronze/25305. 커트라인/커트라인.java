
import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int cutLine = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < people; i++) {
			list.add(sc.nextInt());
		}
		sort(list, reverseOrder());
		System.out.println(list.get(cutLine - 1));
	}

}
