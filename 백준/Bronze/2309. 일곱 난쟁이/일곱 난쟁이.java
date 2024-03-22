
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		// TODO : 9명 중 7명의 키의 합이 100이 되는 7명을 찾아라

		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
		int sum = list.stream().reduce(0, Integer::sum);

		List tmp = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == sum - 100) {
					tmp.add(list.get(i));
					tmp.add(list.get(j));
				}
			}
		}
		list.remove(tmp.get(0));
		list.remove(tmp.get(1));

		Collections.sort(list);
		for (var l : list) {
			System.out.println(l);
		}


	}

}
