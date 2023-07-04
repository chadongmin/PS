import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int loop = sc.nextInt();
        int[] arr = new int[tc+1];
        arr[0] = 0;

        for(int i = 1 ; i<tc+1;i++){
            arr[i] = arr[i-1] +  sc.nextInt();
        }

        for(int i = 0;i<loop;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(arr[end] - arr[start-1]);
        }
    }
}
