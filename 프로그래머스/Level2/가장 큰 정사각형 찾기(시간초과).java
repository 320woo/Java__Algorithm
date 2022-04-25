import java.util.*;
class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        
        loop:
        for(int i=board.length; i>0; i--){
            int a = check(i,board);
            if(a >= 1){
                answer = i;
                break loop;
            }
        }
        
        answer = answer * answer;
        return answer;
    }
    
    public int check(int size, int[][] board){
        int h = board.length - size + 1;
        int w = board[0].length - size + 1;
        
        boolean flag = false;
        
        loop:
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(board[i][j] == 1){
                    flag = count(i, j, size, board);
                    if(flag == true)break loop;
                }
            }
        }
        
        if(flag ==  true)return 1;
        else return 0;
        
    }
    
    public boolean count(int h, int w, int size, int[][] board){
        boolean flag = true;
        loop:
        for(int i = h; i < h + size; i++){
            for(int j = w; j < w + size; j++){
                if(board[i][j] == 1)continue;
                else {
                    flag = false;
                    break loop;
                }
            }
        }
        
        if(flag == true)return true;
        else return false;
    }
    
}