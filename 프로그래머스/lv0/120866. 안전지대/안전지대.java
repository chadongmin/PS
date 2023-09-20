import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] dirY={-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dirX={0, 1, 1, 1, 0, -1, -1, -1};
        int len = board.length;
        ArrayList<int[]> list = new ArrayList<>();
        
        System.out.println(len);
        for(int x = 0; x < len;x++){
            for(int y = 0; y<len;y++){
                
                if(board[x][y] == 1){
                    int[] tmp = new int[]{x, y};
                    list.add(tmp);
                }
            }
        }
         for(int a = 0 ; a < list.size(); a++){
            int i = list.get(a)[0];
            int j = list.get(a)[1];
            for(int k = 0 ; k < 8; k++){
            
             int nx = i + dirX[k];
             int ny = j + dirY[k];
                if(nx >=0 && nx < len && ny >= 0  && ny < len){
                    board[nx][ny] = 1;
                }
            }
            //System.out.println(i+" "+j);
        }
        for(int i = 0 ; i < board.length;i++){
            for(int j = 0 ; j< board[i].length;j++){
                if (board[i][j] == 0)answer++;
            }
            
        }
        return answer;
    }
}