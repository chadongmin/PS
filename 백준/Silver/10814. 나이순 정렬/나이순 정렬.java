
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		List<Person> list = new ArrayList<>();
		int cnt = 1;

		for (int i = 0; i < tc; i++) {

			int age = sc.nextInt();
			String name = sc.next();
			Person person = new Person(age, name, cnt++);
			list.add(person);
		}

		list.sort((o1, o2) ->
		{
			if (o1.age == o2.age) {
				return o1.cnt - o2.cnt;
			}
			return o1.age - o2.age;
		});

		for (var l : list) {
			System.out.println(l.getAge() + " " + l.getName());
		}
	}

	static class Person {

		int age;
		String name;
		int cnt;

		public Person(int age, String name, int cnt) {
			this.age = age;
			this.name = name;
			this.cnt = cnt;
		}

		public int getAge() {
			return age;
		}

		public String getName() {
			return name;
		}

		public int getCnt() {
			return cnt;
		}
	}


}
