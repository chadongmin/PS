
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		int cnt = 1;

		Person[] personList = new Person[tc];
		for (int i = 0; i < tc; i++) {

			int age = sc.nextInt();
			String name = sc.next();
			Person person = new Person(cnt,age, name);
			cnt++;

			personList[i]= person;
		}
		Arrays.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getAge() == o2.getAge()){
					return o1.getCnt() - o2.getCnt();
				}return o1.getAge() - o2.getAge();
			}
		});

		for (int i = 0; i < personList.length; i++) {
			System.out.println(personList[i].getAge()+" "+personList[i].getName());
		}
	}

	static class Person {

		private int cnt;
		private Integer age;
		private String name;

		public Person(int cnt, int age, String name) {
			this.cnt = cnt;
			this.age = age;
			this.name = name;
		}

		public int getCnt() {
			return cnt;
		}

		public int getAge() {
			return age;
		}

		public String getName() {
			return name;
		}
	}


}
