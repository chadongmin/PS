import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        int[] check = new int[10001];
        //check[0] =1;
        int L = 0 ;
        Q.offer(0);
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0 ; i < len ; i++){
                
                int x = Q.poll();
                if(x == target) {
                    answer++;
                    break;
                }
                for(int j = 0;  j < numbers.length;j++){
                    int minus = x - numbers[j];
                    int plus = x + numbers[j];
                    if (plus >= 0 && check[plus] == 0){
                        check[plus] = 1;
                        Q.offer(plus);
                    }
                    if (minus >= 0 && check[minus] == 0){
                        check[minus] = 1;
                        Q.offer(minus);
                    }
                }
            }
            L++;
        }
        
        return answer;
    }
}