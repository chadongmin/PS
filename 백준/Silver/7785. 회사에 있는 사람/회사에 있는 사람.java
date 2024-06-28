
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<String> set = new TreeSet<>();

		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			String name = sc.next();
			String status = sc.next();

			if (status.equals("enter")) {
				set.add(name);
			} else {
				set.remove(name);
			}
		}
		List<String> collect = set.stream().collect(Collectors.toList());

		for (int i = collect.size() - 1; i > -1; i--) {
			System.out.println(collect.get(i));
		}


	}

}
