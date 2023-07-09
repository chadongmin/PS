import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i<numbers.length-1;i++){
            for(int j = i+1; j<numbers.length;j++){
                if(arr.size() == 0) arr.add(numbers[i]+numbers[j]);
                    
                else{
                    if(!arr.contains(numbers[i]+numbers[j])){
                        arr.add(numbers[i]+numbers[j]);
                    }
                    
                }
                
            }
        }
        Collections.sort(arr);
        
        int[] answer = new int[arr.size()];
        for(int i = 0 ;i < answer.length;i++){
            answer[i] = arr.get(i);
        }

        return answer;
    }
}