import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> st = new Stack<>();
        st.push(Integer.MAX_VALUE);
        for(int i = 0 ; i < arr.length;i++){
            
            //System.out.println(st.peek());
            if(arr[i]!=st.peek()){
                st.push(arr[i]);
            }
            
        }
        int[] answer = new int[st.size()-1];
        // System.out.println(st.size()-2);
        // System.out.println(st.pop());
        // System.out.println(st.pop());
        for(int i = st.size()-2; i>=0 ;i--){
            // if(st.pop()!=Integer.MAX_VALUE){
            //     answer[i] = st.pop();
            // }
            answer[i] = st.pop();
        }
        return answer;
    }
}