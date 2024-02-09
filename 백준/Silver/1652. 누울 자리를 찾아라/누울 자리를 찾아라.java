
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int row;
    private static int col;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        char[][] arr = new char[tc][tc];
        for (int i = 0 ; i < arr.length;i++){
            String str = sc.next();
            for(int j = 0 ; j < arr[i].length ;j++){
                arr[i][j] = str.charAt(j);
            }
            checkInRow(str);
        }
        checkInCol(arr);
        System.out.println(row+" "+col);
    }
    private static void checkInRow(String str) {
        String[] splitedStr = str.split("X");
        for (String s : splitedStr){
            if (s.contains("..")){
                row++;
            }
        }
    }
    private static void checkInCol(char[][] arr) {
        for (int i = 0 ; i<arr.length;i++){
            StringBuilder s = new StringBuilder();
            for(int j = 0 ;j<arr.length; j++){
                s.append(arr[j][i]);
            }
            String str = s.toString();
            String[] Splited = str.split("X");
            for (String ss : Splited){
                if (ss.contains("..")){
                    col++;
                }
            }
        }
    }
}
