class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1 ; i < food.length;i++){
            if( food[i] % 2 !=0 ){
                food[i]-=1;
                for(int j = 0; j < food[i]/2;j++){
                    answer += Integer.toString(i);
                }
            }else{
                for(int j = 0; j < food[i]/2;j++){
                    answer += Integer.toString(i);
                }
            }
        }
        answer+="0";
        StringBuilder sb = new StringBuilder();
        sb.append(answer.substring(0, answer.length()-1));
        answer+= sb.reverse();
        return answer;
    }
}