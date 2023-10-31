import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int[] dr = {-1, 0, 1, 0};
		int[] dc = {0, 1, 0, -1};
		Queue<int[]> Q = new LinkedList<>();
        int n = maps.length;
        int m = maps[0].length;
		Q.offer(new int[]{0, 0});
		int L = 1;
		while(!Q.isEmpty()){
			int len = Q.size();
			for(int i = 0; i < len; i++){
				int[] p = Q.poll();
                
				for(int k = 0; k < 4; k++){
					int nr = p[0] + dr[k];
					int nc = p[1] + dc[k];
				    if(nr == n-1 && nc == m-1) return L+1;
                    if(nr >=0  && nr < n && nc >= 0 && nc < m && maps[nr][nc] == 1){
                        maps[nr][nc] = 0;
                        Q.offer(new int[]{nr, nc});    
                    }
                    
				}
			}
			L++;
		}
		return -1;
    }
}