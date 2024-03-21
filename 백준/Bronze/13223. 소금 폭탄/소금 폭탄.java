import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String now = sc.next();
		String target = sc.next();

		String[] nowTime = now.split(":");
		String[] targetTime = target.split(":");

		int targetTimeAmount = Integer.parseInt(targetTime[0]) * 3600
			+ Integer.parseInt(targetTime[1]) * 60
			+ Integer.parseInt(targetTime[2]);

		int nowTimeAmount = Integer.parseInt(nowTime[0]) *  3600
			+ Integer.parseInt(nowTime[1]) * 60
			+ Integer.parseInt(nowTime[2]);

		if (nowTimeAmount >= targetTimeAmount){
			targetTimeAmount += (60 * 60 * 24);
		}
		int result = targetTimeAmount - nowTimeAmount;


		int resultHour = result / 3600;
		int resultMin = (result % 3600) / 60;
		int resultSec = result % 60;

		String str = "";

		str = String.format("%02d:%02d:%02d", resultHour, resultMin, resultSec);
		System.out.println(str);


	}

}
