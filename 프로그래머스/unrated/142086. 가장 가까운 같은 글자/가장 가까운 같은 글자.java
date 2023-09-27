import java.util.*;
class Solution {
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] answer = new int[s.length()];
        for(int i = 0 ; i < s.length();i++){
            if(sb.lastIndexOf(String.valueOf(s.charAt(i))) == -1){
                answer[i] = -1;
            }else{
                answer[i] = i - sb.lastIndexOf(String.valueOf(s.charAt(i)));    
            }
            
            System.out.println(sb.lastIndexOf(String.valueOf(s.charAt(i))));
            sb.append(s.charAt(i));
            //System.out.println(sb);
            //System.out.println(sb.lastIndexOf(String.valueOf(s.charAt(i))));
            
        }
        return answer;
    }
}