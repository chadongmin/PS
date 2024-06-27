
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int avgNum = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			avgNum += num;
			list.add(num);
		}
		Collections.sort(list);

		System.out.println(avgNum / 5);
		System.out.println(list.get(2));

	}

}
