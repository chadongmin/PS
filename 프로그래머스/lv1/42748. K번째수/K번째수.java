import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        
        for(int i = 0 ;i<commands.length;i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int index = commands[i][2];
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int j = start-1;j<end;j++){
                arr.add(array[j]);
            }
            Collections.sort(arr);
            answer[i] = arr.get(index-1);
            //System.out.println(arr.get(index-1));
        }
        // for(var a : array){
        //     System.out.println(a);
        // }
        return answer;
    }
}