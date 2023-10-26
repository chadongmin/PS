import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(var t : tangerine){
            map.put(t, map.getOrDefault(t,0)+1);
        }
        //System.out.println(map);
        List<Integer> list = new ArrayList<>(map.values());
        
        Collections.sort(list, Collections.reverseOrder());
       // System.out.println(list);
        for(var a : list){
            k-=a;
            answer++;
            if(k < 1){
                break;
            }
            
        }
        
        //System.out.println(list);
        return answer;
    }
}