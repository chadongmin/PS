
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		char[][] arr = new char[x][y];

		int xCnt = 0; int yCnt = 0;

		for (int i = 0; i < x; i++) {
			String input = sc.next();
			for (int j = 0; j < y; j++) {
				arr[i][j] = input.charAt(j);
			}
		}

		for (int r = 0; r < x; r++) {
			boolean xFlag = false;
			for (int c = 0; c < y; c++) {
				if (arr[r][c] == 'X'){
					xFlag= true;
					break;
				}
			}
			if (xFlag) xCnt++;
		}

		for (int c = 0; c < y; c++) {
			boolean yFlag = false;
			for (int r = 0; r < x; r++) {
				if (arr[r][c] == 'X'){
					yFlag= true;
					break;
				}
			}
			if (yFlag) yCnt++;
		}
		System.out.println(Math.max(x - xCnt, y - yCnt));

	}
}
