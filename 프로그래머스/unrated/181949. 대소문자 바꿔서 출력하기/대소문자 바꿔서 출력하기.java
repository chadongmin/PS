import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println(z);
        String a = sc.next();
        for(int i = 0 ; i<a.length();i++){
            if(a.charAt(i)>='a'&&a.charAt(i)<='z'){
                System.out.print(String.valueOf(a.charAt(i)).toUpperCase());
            }else{
                System.out.print(String.valueOf(a.charAt(i)).toLowerCase());
            }
                       
        }
        //System.out.println(a);
    }
}