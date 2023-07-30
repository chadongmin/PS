
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] result={1, 1, 2, 2, 2 , 8};
        int[] input = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
            System.out.print(result[i] - input[i]+" ");
        }
    }
}
