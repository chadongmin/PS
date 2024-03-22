
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		int[] arr = new int[tc];
		boolean[] exist = new boolean[10000001];

		for (int i = 0; i < tc; i++) {
			arr[i] = sc.nextInt();
			//System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < tc; i++) {
			exist[arr[i]] = true;
		}

		int target = sc.nextInt();
		int cnt = 0;

		for (int i = 0; i < tc; i++) {
			if (target - arr[i] > 0 && target -arr[i] < 1000000){
				cnt+= exist[target-arr[i]]?1:0;
			}
		}
		System.out.println(cnt / 2);
	}

}
