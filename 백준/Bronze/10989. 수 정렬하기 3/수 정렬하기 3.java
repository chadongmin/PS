
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		int[] list = new int[tc];
		for (int i = 0; i < tc; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(list);
		for (int i = 0; i < list.length; i++) {
			bw.write(list[i]+"\n");
		}
		bw.flush();
		bw.close();

	}
}
