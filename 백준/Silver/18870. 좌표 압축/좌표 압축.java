
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		int[] arr = new int[tc];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < tc; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		//TODO : 카운팅배열처럼 만들건지
		Map<Integer, Integer> map = new HashMap<>();
		int[] arr2 = arr.clone();
		Arrays.sort(arr2);

		int rank = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (!map.containsKey(arr2[i])) {
				map.put(arr2[i], rank);
				rank++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			bw.write(map.get(arr[i]) + " ");
		}
		bw.flush();
		bw.close();
	}
}
