import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		int sum = 0; int idx = 1;
		List<Integer> list = new ArrayList();

		//삼각수 초기화
		while(sum <= 1000){
			sum = idx*(idx+1)/2;
			list.add(sum);
			idx++;
		}
		for (int i = 0; i < tc; i++) {
			int num = sc.nextInt();

			List<Integer> tmp = list.stream().filter(o -> o <= num).collect(Collectors.toList());

			boolean flag = false;
			for (int j = 0; j < tmp.size(); j++) {
				for (int k = j; k < tmp.size(); k++) {
					for (int l =k; l < tmp.size(); l++) {
						if (num == tmp.get(j)+tmp.get(k)+tmp.get(l)){
							flag = true;
						}
					}
				}
			}
			if (flag) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

}
