
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		Map<String, String >map = new HashMap<>();

		for (int i = 0; i < tc; i++) {
			String name = sc.next();
			String status = sc.next();

			map.put(name, status);
			if (status.equals("leave")){
				map.remove(name);
			}
		}
		List<String > list = new ArrayList<>();
		for (var k : map.keySet()){
			list.add(k);
		}
		Collections.sort(list, Collections.reverseOrder());

		for (var l : list){
			System.out.println(l);
		}
	}

}
