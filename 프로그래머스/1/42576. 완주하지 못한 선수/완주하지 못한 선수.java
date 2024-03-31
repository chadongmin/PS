import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
         
        HashMap <String, Integer> map = new HashMap<>();
        for(var p : participant){
            map.put(p, map.getOrDefault(p , 0)+1);
        }
        for(var c : completion){
            if(map.get(c)!=null){
                map.put(c, map.get(c)-1);   
            }
        }
        for(var key : map.keySet()){
            if(map.get(key)==1){
                answer = key;   
            }
            
            // if(map.get(key)==1){
            //     answer = map.get(key);
            // }
                
        }
        //System.out.println(map);
        
        return answer;
    }
}