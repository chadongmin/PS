import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int r1=0;int r2 = 0;int r3 = 0;
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int[] arr = {0,0,0};
        //int[] answer = {};
        
        for(int i = 0 ; i < answers.length;i++){
            
            if(answers[i] == p1[i%5]) arr[0]++;
            if(answers[i] == p2[i%8]) arr[1]++;
            if(answers[i] == p3[i%10]) arr[2]++;
        
        }
       
        int max = Math.max(arr[0], Math.max(arr[1],arr[2]));
        System.out.println(max);
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length;i++){
            if(max == arr[i]){
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size();i++){
            answer[i] = list.get(i);
        }
        
        return  answer;
    }
}