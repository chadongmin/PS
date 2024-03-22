

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < 7; j++) {
				list.add(sc.nextInt());
			}

			List<Integer> result = list.stream().filter(s -> s % 2 == 0)
				.collect(Collectors.toList());

			Integer sum = result.stream().reduce(0, Integer::sum);

			Collections.sort(result);

			System.out.println(sum + " " + result.get(0));
		}

	}

}
