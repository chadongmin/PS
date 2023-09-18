import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
    
        for(int i = 0 ; i<quiz.length;i++){
            StringTokenizer st = new StringTokenizer(quiz[i]);    
            int x = Integer.parseInt(st.nextToken());
            String y = st.nextToken();
            int z = Integer.parseInt(st.nextToken());
            st.nextToken();
            int result = Integer.parseInt(st.nextToken());
            
            int num;
            if(y.equals("+")){
                num = x + z;
            }else{
                num = x - z;
            }
            
            if(num == result){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
            
            //System.out.println(answer[i]);
            //return answer;
        }
        return answer;
    }
}