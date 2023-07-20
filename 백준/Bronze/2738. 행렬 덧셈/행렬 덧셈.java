
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        int[][] arr2 = new int[N][M];

        for(int i = 0 ; i< arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i< arr2.length;i++){
            for(int j = 0; j<arr2[i].length;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i< arr2.length;i++){
            for(int j = 0; j<arr2[i].length;j++){
                System.out.print(arr[i][j] + arr2[i][j]+" ");
            }
            System.out.println();
        }


    }
}
