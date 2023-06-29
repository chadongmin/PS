
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int size= sc.nextInt();
        int[] arr = new int[size];
        int ans = 0;

        for (int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int test_num = sc.nextInt();
        int[] test = new int[test_num];

        for (int i = 0; i < test_num;i++){
            test[i] = sc.nextInt();

            int key = test[i];
            //System.out.println(UpperBound(arr, key));
            //System.out.println(LowerBound(arr, key));
            sb.append(UpperBound(arr, key)-LowerBound(arr, key)).append(" ");

        }
        System.out.println(sb);


    }
    public static int UpperBound(int[] arr, int key){
        int lo = 0;
        int hi = arr.length;

        while(lo < hi){
            int mid = (lo + hi) / 2;
            if(arr[mid] > key){
                hi = mid;
            }
            else lo = mid + 1;
        }
        return lo;
    }
    public static int LowerBound(int[] arr, int key){
        int lo = 0;
        int hi = arr.length;

        // lo가 hi랑 같아질 때 까지 반복
        while(lo < hi){
            int mid = (lo + hi) / 2;
            if(arr[mid] >= key){
                hi = mid;
            }
            else lo = mid + 1;
        }
        return lo;
    }

}
