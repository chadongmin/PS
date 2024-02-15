import java.util.Scanner;

public class Main {

    public static Integer cnt = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int  i = 0 ; i < tc; i++){
            cnt = 0;
            String input = sc.next();
            System.out.println(isPalindrome(input)+" "+cnt);

        }
    }

    public static int recursion(String s, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }



}
