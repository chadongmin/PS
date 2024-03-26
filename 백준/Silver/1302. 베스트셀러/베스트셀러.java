
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {

			String book = sc.next();
			map.put(book, map.getOrDefault(book, 0) + 1);
		}

		List<String> list = new ArrayList<>(map.keySet());

		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return map.get(o2) - map.get(o1);
			}
		});


		if (list.size()!=1 && map.get(list.get(0)).equals(map.get(list.get(1)))) {
			List<String> tmp = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (map.get(list.get(0)).equals(map.get(list.get(i)))){
					tmp.add(list.get(i));
				}
			}
			Collections.sort(tmp);
			System.out.println(tmp.get(0));
		}else{
			System.out.println(list.get(0));
		}


	}

}
