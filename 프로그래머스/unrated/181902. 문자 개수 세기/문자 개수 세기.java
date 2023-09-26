class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        System.out.println((int)'A');
        System.out.println((int)'Z');
        System.out.println((int)'a');
        System.out.println((int)'z');
        for(var cc : my_string.toCharArray()){
            if((int)cc <= 90){
                answer[(int)cc -65]+=1;
            }else if((int)cc >=97){
                answer[(int)cc - 71]+=1;
            }
        }
        
        return answer;
    }
}