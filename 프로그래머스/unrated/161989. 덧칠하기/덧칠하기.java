class Solution {
    public int solution(int n, int m, int[] section) {
        int ans = 1;
        int start = section[0];
        int end = section[0] + m;
        //System.out.println(start + " "+end);
        for(int i = 0; i < section.length;i++){
            if(section[i] >= start && section[i] <= end-1){
                continue;
            }else{
            
                start = section[i];
                end = section[i] +m;
                //System.out.println(start);
                ans++;
            }
        }
        
       // System.out.println(ans);
        
        return ans;
    }
}