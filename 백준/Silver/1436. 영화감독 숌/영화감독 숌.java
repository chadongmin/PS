

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fixture = 666;
        int cnt = 1;
        while(cnt!=num){
            fixture++;
            if (String.valueOf(fixture).contains("666")){
                cnt++;
            }
        }
        System.out.println(fixture);
    }



}
