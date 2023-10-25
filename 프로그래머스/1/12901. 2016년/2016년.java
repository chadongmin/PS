class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] yoil = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int day = 0;
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i = 0 ; i< month.length;i++){
            if(a-1 == i ) break;
            day+=month[i];
        }
        System.out.println(day);
        day+=b;
        
        
        int index = day % 7 -1;
        if(index == -1) {
            answer = yoil[yoil.length-1];
            return answer;
        }
        answer = yoil[index];
    
        
        return answer;
    }
}