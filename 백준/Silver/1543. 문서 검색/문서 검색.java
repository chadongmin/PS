
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {

		//TODO : 문자열에서 target이 존재하면 target을 지운다. 그리고 다시 target이 없을 때까지 탐색을 반복

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String target = br.readLine();

		int cnt = 0;
		int targetStartIdx = 0;

		while(str.contains(target)){
			cnt++;
			targetStartIdx = str.indexOf(target, -1);
			str = str.substring(targetStartIdx + target.length());
		}
		System.out.println(cnt);
	}
}
