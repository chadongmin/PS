import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<score.length;i++){
            if(arr.size() < k){
                arr.add(score[i]);
                Collections.sort(arr);
                answer[i] = arr.get(0);
                continue;
            }
            else if(arr.size() == k){
                if(score[i] > arr.get(0)) {
                    arr.remove(0);
                    arr.add(score[i]);
                    Collections.sort(arr);
                    answer[i] = arr.get(0);
                }
            }
            answer[i] = arr.get(0);
        }
        
        
        
        
        
        // for(var a : arr){
        //     System.out.println(a);
        // }
        return answer;
    }
}