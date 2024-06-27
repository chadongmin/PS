
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		List<xy> list = new ArrayList<>();

		for (int i = 0; i < tc; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			list.add(new xy(x, y));
		}

		list.sort((o1, o2) ->
		{
			if (o1.x == o2.x) {
				return o1.y - o2.y;
			}
			return o1.x - o2.x;
		});

		list.stream().forEach(ob -> System.out.println(ob.x + " " + ob.y));
	}

	static class xy {

		int x;
		int y;

		public xy(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
	}

}
