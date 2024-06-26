
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] arr = new int[N+1][N+1];
		int[][] acc = new int[N+1][N+1];

		int M = sc.nextInt();

		for (int i = 1; i < N+1; i++) {
			for (int j = 1; j < N + 1; j++) {
				arr[i][j] = sc.nextInt();
				// row, column 누적합 구하는 과정
				acc[i][j] +=  arr[i][j] + acc[i][j-1] + acc[i-1][j] - acc[i-1][j-1];
			}
		}
		while(M-- > 0){
			int startX = sc.nextInt();
			int startY = sc.nextInt();
			int endX = sc.nextInt();
			int endY = sc.nextInt();

			//startX, startY ~ endX, endY의 누적합 구하는 로직
			int result = acc[endX][endY] - acc[startX-1][endY] - acc[endX][startY-1] + acc[startX-1][startY-1];

			System.out.println(result);
		}
	}
	
}
