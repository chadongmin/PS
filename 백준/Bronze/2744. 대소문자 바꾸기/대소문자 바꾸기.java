
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		for(var s : str.toCharArray()){
			if (s >= 'a' && s<='z'){
				char c = (char) ((int) s - 32);
				sb.append(c);
			}else{
				char c = (char) ((int) s + 32);
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
