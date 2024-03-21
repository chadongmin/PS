
import com.sun.jdi.IntegerValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toLowerCase();

		int[] arr = new int[26];

		for (var s : str.toCharArray()){
			arr[(int) s -'a']++;
		}

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int tmp= -1; int same = -1;
		for (int i = 0; i < 26; i++) {
			if (tmp == list.get(i)) same = list.get(i);
			tmp = Math.max(tmp, list.get(i));
		}
		if (tmp == same){
			System.out.println("?");
		}else{
			int i = list.indexOf(tmp);
			System.out.println((char)('A'+i));
		}
	}
}
