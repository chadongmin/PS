import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        //1점부터 k점까지 사과 점수 매김
        //한 상자에 사과를 m개씩 담아서 포장
        //가격은 가장 낮은 점수 x m
        int answer = 0;
        int[] arr = new int[m];
        List<Integer> list = new ArrayList();
        Set set = new TreeSet();
        Arrays.sort(score);
        for(int i = score.length-1; i > -1 ; i--){
            list.add(score[i]);
            //System.out.println(i+" "+list);
            //2 5 8 11
            if(list.size() == m){
                answer += (Collections.min(list) * m);
                list.clear();
            }
        }
        
        return answer;
    }
}